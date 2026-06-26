package com.example.interviewprep.entity;

import com.example.interviewprep.enums.Difficulty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "questions", uniqueConstraints = {
        @UniqueConstraint(name= "uk_question_order", columnNames = {"interview_id", "question_order"})
})
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String questionText;

    @Column(nullable = false)
    private String category;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Difficulty difficulty;

    @Column(nullable = false)
    private int questionOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interview_id", referencedColumnName = "id", nullable = false)
    private Interview interview;

    @Column(nullable = false, name= "generated_by_ai")
    private boolean generatedByAi;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
}

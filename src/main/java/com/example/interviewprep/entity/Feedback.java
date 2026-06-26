package com.example.interviewprep.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int score;

    private int technicalAccuracy;
    private int clarity;
    private int completeness;

    @Column(columnDefinition = "TEXT")
    private String strengths;
    @Column(columnDefinition = "TEXT")
    private String improvements;
    @Column(columnDefinition = "TEXT")
    private String idealAnswer;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "answer_id",  unique = true, nullable = false)
    private Answer answer;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime generatedAt;
}

package com.example.interviewprep.dto;

import com.example.interviewprep.enums.Difficulty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class QuestionResponse {

    private Long questionId;
    private Long interviewId;
    private String questionText;
    private String category;
    private Difficulty difficulty;

    private int questionOrder;
    private boolean generatedByAi;

    private LocalDateTime createdAt;
}

package com.example.interviewprep.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AnswerResponse {

    private Long answerId;
    private Long questionId;
    private String answerText;

    private LocalDateTime submittedAt;
}

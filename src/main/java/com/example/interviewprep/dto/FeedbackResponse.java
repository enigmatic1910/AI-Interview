package com.example.interviewprep.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FeedbackResponse {

    private Long feedBackId;
    private Long answerId;
    private Integer score;
    private Integer technicalAccuracy;
    private Integer clarity;
    private Integer completeness;

    private String strengths;
    private String improvements;
    private String idealAnswer;

    private LocalDateTime generatedAt;

}

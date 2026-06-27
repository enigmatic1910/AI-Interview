package com.example.interviewprep.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateFeedbackRequest {

    @NotNull(message = "Answer id is required")
    @Positive(message = "Answer id must be positive")
    private Long answerId;
}

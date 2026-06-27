package com.example.interviewprep.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubmitAnswerRequest {

    @NotNull(message = "Question id is required")
    @Positive(message = "Question id must be positive")
    private Long questionId;

    @NotBlank(message = "Answer text is required")
    @Size(max = 5000, message = "Answer text must not exceed 5000 characters")
    private String answerText;
}

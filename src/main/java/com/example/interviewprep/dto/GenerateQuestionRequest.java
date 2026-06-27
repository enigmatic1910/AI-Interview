package com.example.interviewprep.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateQuestionRequest {

    @NotNull(message = "Interview id is required")
    private Long interviewId;

    @NotBlank(message = "Category is required")
    @Size(max = 100, message = "Category must not exceed 100 characters")
    private String category;

    @NotNull(message = "Number of questions is required")
    @Min(value = 1, message = "Number of questions must be at least 1")
    @Max(value = 20, message = "Number of questions must not exceed 20")
    private Integer noOfQuestions;

}

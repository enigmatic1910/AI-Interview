package com.example.interviewprep.dto;

import com.example.interviewprep.enums.Difficulty;
import com.example.interviewprep.enums.InterviewType;
import com.example.interviewprep.enums.JobRole;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateInterviewRequest {

    @NotNull(message = "Job role is required")
    private JobRole jobRole;

    @NotNull(message = "Difficulty is required")
    private Difficulty difficulty;

    @NotNull(message = "Interview type is required")
    private InterviewType interviewType;

    @NotNull(message = "Number of questions is required")
    @Min(value = 1, message = "Number of questions must be at least 1")
    @Max(value = 20, message = "Number of questions must not exceed 20")
    private Integer noOfQuestions;

}

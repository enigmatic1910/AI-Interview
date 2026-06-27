package com.example.interviewprep.dto;

import com.example.interviewprep.enums.Difficulty;
import com.example.interviewprep.enums.InterviewStatus;
import com.example.interviewprep.enums.InterviewType;
import com.example.interviewprep.enums.JobRole;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class InterviewResponse {

    private Long userId;
    private Long interviewId;
    private JobRole jobRole;
    private Difficulty difficulty;
    private InterviewType interviewType;
    private InterviewStatus status;
    private LocalDateTime startedAt;
    private LocalDateTime completedAt;

}

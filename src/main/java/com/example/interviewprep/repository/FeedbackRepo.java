package com.example.interviewprep.repository;

import com.example.interviewprep.entity.Answer;
import com.example.interviewprep.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Long> {

    Optional<Feedback> findFeedbackByAnswer(Answer answer);
}

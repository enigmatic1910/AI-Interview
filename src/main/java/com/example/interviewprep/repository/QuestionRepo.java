package com.example.interviewprep.repository;

import com.example.interviewprep.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long> {

    List<Question> findByInterviewIdOrderByQuestionOrderAsc(Long interviewId);
}

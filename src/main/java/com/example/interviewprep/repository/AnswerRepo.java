package com.example.interviewprep.repository;

import com.example.interviewprep.entity.Answer;
import com.example.interviewprep.entity.Question;
import com.example.interviewprep.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnswerRepo extends JpaRepository<Answer, Long> {

    Optional<Answer> findByQuestionAndUser(Question question, User user);
}

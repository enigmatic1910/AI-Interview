package com.example.interviewprep.repository;

import com.example.interviewprep.entity.Interview;
import com.example.interviewprep.entity.Question;
import com.example.interviewprep.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterviewRepo extends JpaRepository<Interview, Long> {

    List<Interview> findByUser(User user);
}

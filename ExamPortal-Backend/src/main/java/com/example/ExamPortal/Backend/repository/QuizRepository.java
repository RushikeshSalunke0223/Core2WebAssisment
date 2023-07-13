package com.example.ExamPortal.Backend.repository;

import com.example.ExamPortal.Backend.model.exam.Category;
import com.example.ExamPortal.Backend.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

    public List<Quiz> findByCategory(Category category);

    public List<Quiz> findByActive(Boolean b);

    public List<Quiz> findByCategoryAndActive(Category category, Boolean b);
}

package com.example.ExamPortal.Backend.repository;

import com.example.ExamPortal.Backend.model.exam.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}

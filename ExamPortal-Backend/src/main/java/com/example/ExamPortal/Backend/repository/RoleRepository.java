package com.example.ExamPortal.Backend.repository;

import com.example.ExamPortal.Backend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
   // Role findByRoleName(String roleName);
}

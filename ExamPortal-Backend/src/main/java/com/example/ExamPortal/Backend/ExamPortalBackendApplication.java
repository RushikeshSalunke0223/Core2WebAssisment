package com.example.ExamPortal.Backend;

import com.example.ExamPortal.Backend.model.Role;
import com.example.ExamPortal.Backend.model.User;
import com.example.ExamPortal.Backend.model.UserRole;
import com.example.ExamPortal.Backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unused")
@SpringBootApplication
public class ExamPortalBackendApplication {
    @Autowired
    private UserService userService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(ExamPortalBackendApplication.class, args);
    }

      
    }



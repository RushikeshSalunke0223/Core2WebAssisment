package com.example.ExamPortal.Backend.controller;

import com.example.ExamPortal.Backend.model.exam.Category;
import com.example.ExamPortal.Backend.model.exam.Quiz;
import com.example.ExamPortal.Backend.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
@CrossOrigin("*")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @PostMapping("/")
    public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz quiz) {

        return ResponseEntity.ok(quizService.addQuiz(quiz));
    }

    @GetMapping("/{qid}")
    public ResponseEntity<?> getQuiz(@PathVariable("qid") Long qid) {
        Quiz quiz = quizService.getQuiz(qid);
        System.out.println(">>>>>>>" + quiz.getDescription());
        return ResponseEntity.ok(quiz);
    }

    @GetMapping("/")
    public ResponseEntity<?> getQuizzes() {
        return ResponseEntity.ok(quizService.getQuizzes());
    }

    @PutMapping("/")
    public ResponseEntity<?> updateQuiz(@RequestBody Quiz quiz) {
        Quiz quiz1 = quizService.updateQuiz(quiz);
        return ResponseEntity.ok(quiz1);
    }

    @DeleteMapping("/{qid}")
    public void deleteQuiz(@PathVariable("qid") Long qid) {
        quizService.deleteQuiz(qid);
    }


    @GetMapping("category/{cid}")
    public List<Quiz> getQuizzesOfCategory(@PathVariable("cid") Long cid) {
        Category category = new Category();
        category.setCid(cid);
        return this.quizService.getQuizzesOfCategory(category);
    }

    @GetMapping("/active")
    public List<Quiz> getActiveQuizzes() {
        return quizService.getActiveQuizzes();
    }

    @GetMapping("/category/active/{cid}")
    public List<Quiz> getActiveQuizzesOfCategory(@PathVariable("cid") Long cid) {
        Category category = new Category();
        category.setCid(cid);
        return quizService.getActiveQuizzesOfCategory(category);
    }
}

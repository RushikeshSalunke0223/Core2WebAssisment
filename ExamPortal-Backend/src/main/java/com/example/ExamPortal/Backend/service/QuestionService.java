package com.example.ExamPortal.Backend.service;

import com.example.ExamPortal.Backend.model.exam.Category;
import com.example.ExamPortal.Backend.model.exam.Question;
import com.example.ExamPortal.Backend.model.exam.Quiz;

import java.util.Set;

@SuppressWarnings("unused")
public interface QuestionService {
    public Question addQuestion(Question question);

    public Question updateQuestion(Question question);

    public Set<Question> getQuestions();

    public Question getQuestion(Long quesid);

    public Set<Question> getQuestionsOfQuiz(Quiz quiz);

    public void deleteQuestion(Long quesid);
}

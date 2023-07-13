package com.example.ExamPortal.Backend.controller;

import com.example.ExamPortal.Backend.model.exam.Category;
import com.example.ExamPortal.Backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/")
    public ResponseEntity<?> addCategory(@RequestBody Category category) {
        Category category1 = categoryService.addCategory(category);
        return ResponseEntity.ok(category1);
    }

    @GetMapping("/{cid}")
    public ResponseEntity<?> getCategory(@PathVariable("cid") Long cid) {
        Category category = categoryService.getCategory(cid);
        return ResponseEntity.ok(category);
    }

    @GetMapping("/")
    public ResponseEntity<?> getCategories() {
        return ResponseEntity.ok(categoryService.getCategories());
    }

    @PutMapping("/")
    public ResponseEntity<?> updateCategory(@RequestBody Category category) {
        Category category1 = categoryService.updateCategory(category);
        return ResponseEntity.ok(category1);
    }

    @DeleteMapping("/{cid}")
    public void deleteCategory(@PathVariable("cid") Long cid) {
        categoryService.deleteCategory(cid);
    }
}

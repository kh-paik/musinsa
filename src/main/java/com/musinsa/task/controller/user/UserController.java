package com.musinsa.task.controller.user;

import com.musinsa.task.service.category.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

  CategoryService categoryService;

  public UserController(CategoryService categoryService) {
    this.categoryService = categoryService;
  }

  @GetMapping("/categories")
  public List<String> getAllCategories() {
    return categoryService.getAllCategories();
  }

  @GetMapping("/categories/sub")
  public List<String> getAllSubCategory() {
    return categoryService.getAllSubCategories();
  }

  @GetMapping("/categories/{categoryId}")
  public List<String> getSubCategory(@PathVariable Integer categoryId) {
    return categoryService.getSubCategory(categoryId);
  }
}

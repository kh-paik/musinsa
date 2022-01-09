package com.musinsa.task.controller.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminController {

  @PostMapping("/categories")
  public String addCategory() {
    return "POST/category";
  }

  @PutMapping("/categories")
  public void updateCategory() {

  }

  @DeleteMapping("/categories")
  public void deleteCategory() {

  }

}

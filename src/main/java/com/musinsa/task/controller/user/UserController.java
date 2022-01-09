package com.musinsa.task.controller.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

  @GetMapping("/user/{categoryId}")
  public String getSubCategory(@PathVariable String categoryId) {
    return "GET/category";
  }

  @GetMapping("/user")
  public void getAllSubCategory() {

  }
}

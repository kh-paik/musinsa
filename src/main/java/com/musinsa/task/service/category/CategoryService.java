package com.musinsa.task.service.category;

import java.util.List;

public interface CategoryService {
  List<String> getAllCategories();

  List<String> getAllSubCategories();

  List<String> getSubCategory(Integer categoryId);

  void addCategory();

  void updateCategory();

  void deleteCategory();
}

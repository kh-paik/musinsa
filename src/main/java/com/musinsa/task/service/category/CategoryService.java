package com.musinsa.task.service.category;

import com.musinsa.task.dto.DTO;

import java.util.List;

public interface CategoryService {
  List<String> getAllCategories();

  List<String> getAllSubCategories();

  List<String> getSubCategory(Integer categoryId);

  Integer addCategory(DTO.CategoryDTO categoryDTO);

  Integer addSubCategory(DTO.SubCategoryDTO subCategoryDTO);

  void updateCategory();

  void deleteCategory();

  void deleteSubCategory();
}

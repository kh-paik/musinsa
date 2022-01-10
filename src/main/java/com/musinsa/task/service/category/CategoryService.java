package com.musinsa.task.service.category;

import com.musinsa.task.dto.DTO.CategoryDTO;
import com.musinsa.task.dto.DTO.SubCategoryDTO;

import java.util.List;

public interface CategoryService {
  List<String> getAllCategories();

  List<String> getAllSubCategories();

  List<String> getSubCategory(Integer categoryId);

  Integer addCategory(CategoryDTO categoryDTO);

  Integer addSubCategory(SubCategoryDTO subCategoryDTO);

  String updateCategoryName(CategoryDTO categoryDTO);

  String updateSubCategoryName(SubCategoryDTO subCategoryDTO);

  Integer deleteCategory(Integer categoryId);

  Integer deleteSubCategory(SubCategoryDTO subCategoryDTO);
}

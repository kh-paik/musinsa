package com.musinsa.task.repository.category;

import com.musinsa.task.dto.DTO.CategoryDTO;
import com.musinsa.task.dto.DTO.SubCategoryDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CategoryRepository {
  List<String> getAllCategories();

  List<String> getAllSubCategories();

  List<String> getSubCategory(Integer categoryId);

  Integer getCategoryIdByName(CategoryDTO categoryDto);

  Integer getSubCategoryIdByName(SubCategoryDTO subCategoryDTO);

  Integer addCategory(CategoryDTO categoryDto);

  Integer addSubCategory(SubCategoryDTO subCategoryDTO);

  void updateCategoryName(CategoryDTO categoryDTO);

  void updateSubCategoryName(SubCategoryDTO subCategoryDTO);

  void deleteCategory(Integer categoryId);

  void deleteSubCategory(SubCategoryDTO subCategoryDTO);
}

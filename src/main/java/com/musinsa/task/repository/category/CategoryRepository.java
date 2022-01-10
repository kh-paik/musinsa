package com.musinsa.task.repository.category;

import com.musinsa.task.dto.DTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CategoryRepository {
  List<String> getAllCategories();
  List<String> getAllSubCategories();
  List<String> getSubCategory(Integer categoryId);
  Integer getCategoryIdByName(DTO.CategoryDTO categoryDto);
  Integer getSubCategoryIdByName(DTO.SubCategoryDTO subCategoryDTO);

  Integer addCategory(DTO.CategoryDTO categoryDto);
  Integer addSubCategory(DTO.SubCategoryDTO subCategoryDTO);
  void deleteCategory(Integer categoryId);
}

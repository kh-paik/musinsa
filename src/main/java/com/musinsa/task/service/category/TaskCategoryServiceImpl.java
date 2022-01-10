package com.musinsa.task.service.category;

import com.musinsa.task.dto.DTO.CategoryDTO;
import com.musinsa.task.dto.DTO.SubCategoryDTO;
import com.musinsa.task.repository.category.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TaskCategoryServiceImpl implements CategoryService {

  CategoryRepository categoryRepository;

  public TaskCategoryServiceImpl(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  @Override
  public List<String> getAllCategories() {
    List<String> categoryList = categoryRepository.getAllCategories();
    return categoryList;
  }

  @Override
  public List<String> getAllSubCategories() {
    List<String> subCategoryList = categoryRepository.getAllSubCategories();
    return subCategoryList;
  }

  @Override
  public List<String> getSubCategory(Integer categoryId) {
    List<String> subCategoryList = categoryRepository.getSubCategory(categoryId);
    return subCategoryList;
  }

  @Override
  public Integer addCategory(CategoryDTO categoryDTO) {
    Integer idByName = categoryRepository.getCategoryIdByName(categoryDTO);
    if (idByName != null) {
      return null;
    }
    categoryRepository.addCategory(categoryDTO);
    return categoryDTO.getCategoryId();
  }

  @Override
  public Integer addSubCategory(SubCategoryDTO subCategoryDTO) {
    Integer idByName = categoryRepository.getSubCategoryIdByName(subCategoryDTO);
    if (idByName != null) {
      return null;
    }
    categoryRepository.addSubCategory(subCategoryDTO);
    return subCategoryDTO.getSubCategoryId();
  }

  @Override
  public String updateCategoryName(CategoryDTO categoryDTO) {
    categoryRepository.updateCategoryName(categoryDTO);
    return categoryDTO.getCategoryName();
  }

  @Override
  public String updateSubCategoryName(SubCategoryDTO subCategoryDTO) {
    categoryRepository.updateSubCategoryName(subCategoryDTO);
    return subCategoryDTO.getSubCategoryName();
  }

  @Override
  public Integer deleteCategory(Integer categoryId) {
    categoryRepository.deleteCategory(categoryId);
    return categoryId;
  }

  @Override
  public Integer deleteSubCategory(SubCategoryDTO subCategoryDTO) {
    categoryRepository.deleteSubCategory(subCategoryDTO);
    return subCategoryDTO.getSubCategoryId();
  }
}

package com.musinsa.task.service.category;

import com.musinsa.task.dto.DTO;
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
  public Integer addCategory(DTO.CategoryDTO categoryDTO) {
    Integer idByName = categoryRepository.getCategoryIdByName(categoryDTO);
    if (idByName != null) {
      return null;
    }
    categoryRepository.addCategory(categoryDTO);
    return categoryDTO.getCategoryId();
  }

  @Override
  public Integer addSubCategory(DTO.SubCategoryDTO subCategoryDTO) {
    Integer idByName = categoryRepository.getSubCategoryIdByName(subCategoryDTO);
    if (idByName != null) {
      return null;
    }
    categoryRepository.addSubCategory(subCategoryDTO);
    return subCategoryDTO.getSubCategoryId();
  }

  @Override
  public void updateCategory() {
    // Sub-Category-Name 만 바꿀까나
    // Output
    // Client 업데이트를 위해 추가한 데이터를 다시 가져오도록.
  }

  @Override
  public Integer deleteCategory(Integer categoryId) {
    categoryRepository.deleteCategory(categoryId);
    return categoryId;
  }

  @Override
  public Integer deleteSubCategory(DTO.SubCategoryDTO subCategoryDTO) {
    categoryRepository.deleteSubCategory(subCategoryDTO);
    return subCategoryDTO.getSubCategoryId();
  }
}

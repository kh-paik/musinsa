package com.musinsa.task.service.category;

import com.musinsa.task.repository.CategoryRepository;
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
  public void addCategory() {

  }

  @Override
  public void updateCategory() {

  }

  @Override
  public void deleteCategory() {

  }
}

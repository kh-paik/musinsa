package com.musinsa.task.service.category;

import com.musinsa.task.repository.mapper.CategoryMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;



@Slf4j
@Service
public class TaskCategoryServiceImpl implements CategoryService {

  CategoryMapper categoryMapper;

  public TaskCategoryServiceImpl(CategoryMapper categoryMapper) {
    this.categoryMapper = categoryMapper;
  }

  @Override
  public List<String> getAllCategories() {
    List<String> categoryList = categoryMapper.getAllCategories();
    return categoryList;
  }

  @Override
  public List<String> getAllSubCategories() {
    List<String> subCategoryList = categoryMapper.getAllSubCategories();
    return subCategoryList;
  }

  @Override
  public List<String> getSubCategory(Integer categoryId) {
    List<String> subCategoryList = categoryMapper.getSubCategory(categoryId);
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

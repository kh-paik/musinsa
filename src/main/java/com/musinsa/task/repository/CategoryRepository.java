package com.musinsa.task.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CategoryRepository {
  List<String> getAllCategories();
  List<String> getAllSubCategories();
  List<String> getSubCategory(Integer categoryId);
}

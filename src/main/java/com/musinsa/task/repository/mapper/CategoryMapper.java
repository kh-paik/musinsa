package com.musinsa.task.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CategoryMapper {
  List<String> getAllCategories();
  List<String> getAllSubCategories();
  List<String> getSubCategory(Integer categoryId);
}

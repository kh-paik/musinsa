package com.musinsa.task.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class DTO {

  @Getter
  @Setter
  @NoArgsConstructor
  public static class CategoryDTO {
    Integer categoryId;
    String categoryName;
  }

  @Getter
  @Setter
  @NoArgsConstructor
  public static class SubCategoryDTO {
    Integer categoryId;
    Integer subCategoryId;
    String subCategoryName;
  }
}

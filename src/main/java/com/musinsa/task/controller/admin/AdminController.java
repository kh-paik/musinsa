package com.musinsa.task.controller.admin;

import com.musinsa.task.dto.DTO.CategoryDTO;
import com.musinsa.task.dto.DTO.SubCategoryDTO;
import com.musinsa.task.service.category.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminController {

  CategoryService categoryService;

  public AdminController(CategoryService categoryService) {
    this.categoryService = categoryService;
  }

  @PostMapping("/categories")
  public Integer addCategory(@RequestBody CategoryDTO categoryDTO,
                             HttpServletResponse response) {
    Integer newCategoryId = categoryService.addCategory(categoryDTO);
    if (newCategoryId == null) {
      response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
      return -1;
    }
    return newCategoryId;
  }

  @PostMapping("/categories/{categoryId}")
  public Integer addSubCategory(@PathVariable Integer categoryId,
                                @RequestBody SubCategoryDTO subCategoryDTO,
                                HttpServletResponse response) {
    subCategoryDTO.setCategoryId(categoryId);
    Integer newSubCategoryId = categoryService.addSubCategory(subCategoryDTO);
    if (newSubCategoryId == null) {
      response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
      return -1;
    }
    return newSubCategoryId;
  }

  @PutMapping("/categories")
  public String updateCategoryName(@RequestBody CategoryDTO categoryDTO) {
    return categoryService.updateCategoryName(categoryDTO);
  }

  @PutMapping("/categories/{categoryId}")
  public String updateSubCategoryName(@PathVariable Integer categoryId,
                                      @RequestBody SubCategoryDTO subCategoryDTO) {
    subCategoryDTO.setCategoryId(categoryId);
    return categoryService.updateSubCategoryName(subCategoryDTO);
  }

  @DeleteMapping("/categories/{categoryId}")
  public Integer deleteCategory(@PathVariable Integer categoryId) {
    return categoryService.deleteCategory(categoryId);
  }

  @DeleteMapping("/categories/{categoryId}/{subCategoryId}")
  public Integer deleteSubCategory(@PathVariable Integer categoryId,
                                   @PathVariable Integer subCategoryId) {
    SubCategoryDTO subCategoryDTO = new SubCategoryDTO(categoryId, subCategoryId, null);
    return categoryService.deleteSubCategory(subCategoryDTO);
  }
}

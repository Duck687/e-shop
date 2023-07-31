package com.eshop.bricks.service;

import com.eshop.bricks.model.Category;
import com.eshop.bricks.model.Product;
import com.eshop.bricks.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
  @Autowired
  private CategoryRepository categoryRepository;

  public List<Category> getAllCategories()
  {
    return (List<Category>) categoryRepository.findAll();
  }
  public Category getCategoryById(Long id)
  {
    return categoryRepository.findById(id).get();
  }
  public void saveOrUpdate(Category category)
  {
    categoryRepository.save(category);
  }
  public void deleteCategory(Long id)
  {
    categoryRepository.deleteById(id);
  }

}

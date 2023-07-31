package com.eshop.bricks.service;

import com.eshop.bricks.model.Product;
import com.eshop.bricks.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public List<Product> getAllProducts()
  {
    return (List<Product>) productRepository.findAll();
  }
  public Product getProductById(Long id)
  {
    return productRepository.findById(id).get();
  }
  public void saveOrUpdate(Product product)
  {
    productRepository.save(product);
  }
  public void deleteProduct(Long id)
  {
    productRepository.deleteById(id);
  }
}

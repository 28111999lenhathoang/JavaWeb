package com.example.myspring1.model;

import com.example.myspring1.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductModel extends CrudRepository<Product, Integer> {
}

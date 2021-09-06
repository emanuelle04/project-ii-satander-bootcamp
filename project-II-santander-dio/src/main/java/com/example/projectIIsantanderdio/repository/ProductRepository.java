package com.example.projectIIsantanderdio.repository;

import com.example.projectIIsantanderdio.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}

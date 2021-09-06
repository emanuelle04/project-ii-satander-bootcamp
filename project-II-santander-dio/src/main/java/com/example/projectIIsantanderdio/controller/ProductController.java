package com.example.projectIIsantanderdio.controller;

import com.example.projectIIsantanderdio.model.Product;
import com.example.projectIIsantanderdio.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Product getById(@PathVariable Integer id){
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Product> getAll(){
        return productRepository.findAll();
    }

}

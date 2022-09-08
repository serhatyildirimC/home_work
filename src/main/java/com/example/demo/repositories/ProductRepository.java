package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Product;

import java.sql.Date;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findById(int id);
    List<Product> findByName(String name);
    @Query("From Product Where product.lud>:date")
    List<Product> getProductsExpired(Date date);
    @Query("From Product Where product.lud<:date || Where product.lud == null")
    List<Product> getProductsNotExpired(Date date);
}
package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.ProductComment;

import java.sql.Date;
import java.util.List;

public interface ProductCommentRepository extends JpaRepository<ProductComment, Integer> {
    ProductComment findById(int id);
    List<ProductComment> findByProductId(int id);
    List<ProductComment> findByUserId(int id);
    @Query("From ProductComment Where productComment.comment_date>:date1 && Where productComment.comment_date>:date2 ")
    List<ProductComment> getProductsNotExpired(Date date1 , Date date2);
}
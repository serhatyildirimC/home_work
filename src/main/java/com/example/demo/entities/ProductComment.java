package com.example.demo.entities;

import lombok.Data;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Data
@Entity
public class ProductComment {
    @Id
    @GeneratedValue
    private int id;
    private String comment;
    private Date  comment_date;
    @OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
    private User user_id;
    @OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
    private Product product_id;


    ProductComment() {}
    public ProductComment(String comment, Date  comment_date) {
        this.comment = comment;
        this.comment_date = comment_date;
    }
}
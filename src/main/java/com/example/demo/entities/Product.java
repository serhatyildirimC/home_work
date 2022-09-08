package com.example.demo.entities;

import lombok.Data;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double price;
    private Date lud;

    Product() {}
    public Product(String name, double price, Date lud ) {
        this.name = name;
        this.lud =lud;
        this.price = price;
        
    }
}

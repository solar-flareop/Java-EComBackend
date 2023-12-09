package com.ecom.api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private String productDesc;
    private String productImg;


    private List<Category> categories=new ArrayList<>();

    private List<Order> orders=new ArrayList<>();

    private List<Review> reviews=new ArrayList<>();

    private Price price;

}

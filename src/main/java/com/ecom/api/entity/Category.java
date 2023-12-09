package com.ecom.api.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;
@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    private String categoryName;

    private List<Product>products=new ArrayList<>();

}

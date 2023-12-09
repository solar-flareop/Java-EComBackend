package com.ecom.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String delivaryAddress;
    private int orderBill;

    @ManyToOne
    private Product product;

    @ManyToOne
    private User user;


}

package com.ecom.api.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Table(name = "price")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int priceId;
    private String siteName;
    private int amount;

    @OneToOne(mappedBy = "price",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Product product;

}

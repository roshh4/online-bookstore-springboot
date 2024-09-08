package com.bookstore.backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "discounts")
public class Discount {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long discountId;
    private String discountCode;
    private double discountPercentage;
}

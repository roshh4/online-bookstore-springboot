package com.bookstore.backend.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "orders")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    private int totalCount;
    private double price;
    private double cgst;
    private double sgst;
    private double igst;
    private double deliveryCharge;
    
    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "discountId", referencedColumnName = "discountId")
    private Discount discount;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
}

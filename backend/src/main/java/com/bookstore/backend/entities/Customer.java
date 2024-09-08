package com.bookstore.backend.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;

    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private long noOfPurchases;
    private int noOfPurchasesInLast180Days;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}

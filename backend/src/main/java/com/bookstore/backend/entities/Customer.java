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

    // Getters and setters

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getNoOfPurchases() {
        return noOfPurchases;
    }

    public void setNoOfPurchases(long noOfPurchases) {
        this.noOfPurchases = noOfPurchases;
    }

    public int getNoOfPurchasesInLast180Days() {
        return noOfPurchasesInLast180Days;
    }

    public void setNoOfPurchasesInLast180Days(int noOfPurchasesInLast180Days) {
        this.noOfPurchasesInLast180Days = noOfPurchasesInLast180Days;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
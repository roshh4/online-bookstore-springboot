package com.bookstore.backend.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;


    private String name;
    private String description;
    private String isbn;
    private double price;
    private int noOfPages;
    private String publication;
    private String img;
    private LocalDate dateOfPublication; 

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "authorId")
    private Author author;
}

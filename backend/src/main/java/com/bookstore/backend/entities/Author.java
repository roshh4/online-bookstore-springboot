package com.bookstore.backend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "Authors")
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorId;
    private String name;
    private LocalDate birthDate;
    private String description;
    private String img;

    @OneToMany(mappedBy = "author")
    private List<Book> books;
}

package com.bookstore.backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "book_format_associations")
public class BookFormatAssociation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "bookId")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "formatId")
    private NewBookFormat bookFormat;

    private double price;
}

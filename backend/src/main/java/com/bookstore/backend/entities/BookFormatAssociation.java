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

    // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public  NewBookFormat getBookFormat() {
        return bookFormat;
    }

    public void setBookFormat(NewBookFormat bookFormat) {
        this.bookFormat = bookFormat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
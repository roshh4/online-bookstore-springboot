package com.bookstore.backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "book_formats")
public class NewBookFormat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long formatId;

    private String format;

    // Default constructor (required by JPA)
    public NewBookFormat() {
    }

    // Parameterized constructor
    public NewBookFormat(String format) {
        this.format = format;
    }

    // Getters and Setters
    public long getFormatId() {
        return formatId;
    }

    public void setFormatId(long formatId) {
        this.formatId = formatId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

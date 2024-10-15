package com.bookstore.backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "book_formats")
public class NewBookFormat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long formatId;

    @Column(nullable = false, unique = true)
    private String format;

    public NewBookFormat() {
    }

    public NewBookFormat(String format) {
        this.format = format;
    }

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

    @Override
    public String toString() {
        return "NewBookFormat{" +
                "formatId=" + formatId +
                ", format='" + format + '\'' +
                '}';
    }
}
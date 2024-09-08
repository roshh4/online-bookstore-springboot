package com.bookstore.backend.repositories;

import com.bookstore.backend.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
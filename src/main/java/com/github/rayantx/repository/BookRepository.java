package com.github.rayantx.repository;

import com.github.rayantx.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
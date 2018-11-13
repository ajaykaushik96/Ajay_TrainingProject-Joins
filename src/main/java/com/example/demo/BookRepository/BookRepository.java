package com.example.demo.BookRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Book.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
package com.example.demo.repository;

import com.example.demo.docs.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book,Long> {
    // Need to add all the required methods here
    List<Book> findByCategory(String category);
    Book findByBookId(long bookId);
}
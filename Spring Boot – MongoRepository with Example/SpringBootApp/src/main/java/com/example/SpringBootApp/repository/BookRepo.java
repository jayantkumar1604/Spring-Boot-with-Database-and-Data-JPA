package com.example.SpringBootApp.repository;

import com.example.SpringBootApp.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo
        extends MongoRepository<Book, Integer> {
}

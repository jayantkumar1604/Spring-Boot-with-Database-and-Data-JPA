package com.example.demoproject.repository;

import com.example.demoproject.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer> { }

package com.example.demo.repository;

import com.example.demo.model.geek_author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<geek_author, Long> {
}

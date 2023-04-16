package com.example.librarymanagementsystem.Repository;

import com.example.librarymanagementsystem.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

    Author findByEmail(String email);
}

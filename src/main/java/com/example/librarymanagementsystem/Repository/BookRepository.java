package com.example.librarymanagementsystem.Repository;

import com.example.librarymanagementsystem.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}

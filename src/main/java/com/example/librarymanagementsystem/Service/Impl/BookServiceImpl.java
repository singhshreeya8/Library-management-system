package com.example.librarymanagementsystem.Service.Impl;

import com.example.librarymanagementsystem.Entity.Author;
import com.example.librarymanagementsystem.Entity.Book;
import com.example.librarymanagementsystem.Repository.AuthorRepository;
import com.example.librarymanagementsystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    AuthorRepository authorRepository;

   @Override
    public String addBook(Book book) throws Exception {
       Author author;
       try {
           author=authorRepository.findById(book.getAuthor().getId()).get();
       }
       catch (Exception e){
           throw new Exception("Author not present");

       }

       author.getBook().add(book);
       book.setAuthor(author);

       authorRepository.save(author);
       return "book added";
    }
}

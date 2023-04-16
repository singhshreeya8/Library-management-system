package com.example.librarymanagementsystem.Service;

import com.example.librarymanagementsystem.DTO.ResponseDto.AuthorResponseDto;
import com.example.librarymanagementsystem.Entity.Author;
import com.example.librarymanagementsystem.Entity.Student;

public interface AuthorService {
    public String addAuthor(Author author);
    public AuthorResponseDto getByEmail(String email);

}

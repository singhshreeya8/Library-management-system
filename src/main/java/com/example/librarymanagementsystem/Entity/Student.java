package com.example.librarymanagementsystem.Entity;

import com.example.librarymanagementsystem.Enum.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;

    private String mobNo;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)

    Card card;



}

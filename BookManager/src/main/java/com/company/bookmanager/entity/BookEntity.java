package com.company.bookmanager.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book_management")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String bookName;

    String authorName;

    long bookYear;
}

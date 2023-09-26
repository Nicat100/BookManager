package com.company.bookmanager.controller;

import com.company.bookmanager.entity.BookEntity;
import com.company.bookmanager.service.inter.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping(value = "/create")
    public void create(@RequestBody BookEntity bookEntity){
        bookService.create(bookEntity);
    }

//    @GetMapping(value = "/allBooks")
//    public List<BookEntity> getAllBooks(){
//
//        return bookService.getAllBooks();
//
//    }
}

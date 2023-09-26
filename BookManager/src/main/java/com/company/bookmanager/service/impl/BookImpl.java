package com.company.bookmanager.service.impl;

import com.company.bookmanager.entity.BookEntity;
import com.company.bookmanager.repository.BookRepository;
import com.company.bookmanager.service.inter.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookImpl implements BookService {
    private final BookRepository bookRepository;
    @Override
    public void create(BookEntity bookEntity) {
        BookEntity book = BookEntity.builder()
                .bookName(bookEntity.getBookName())
                .authorName(bookEntity.getAuthorName())
                .bookYear(bookEntity.getBookYear())
                .build();

       bookRepository.save(book);
    }

    @Override
    public List<BookEntity> getAllBooks() {
//        return new ArrayList<>(bookRepository.findAll());
        return null;
    }

    @Override
    public BookEntity update(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}

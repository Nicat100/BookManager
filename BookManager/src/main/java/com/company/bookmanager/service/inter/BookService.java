package com.company.bookmanager.service.inter;

import com.company.bookmanager.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    void create(BookEntity bookEntity);
    List<BookEntity> getAllBooks();
    BookEntity update(long id);
    void delete(long id);

}

package com.company.bookmanager.repository;

import com.company.bookmanager.entity.BookEntity;
import com.company.bookmanager.service.inter.BookService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long> {
}

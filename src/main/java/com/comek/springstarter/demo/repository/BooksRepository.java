package com.comek.springstarter.demo.repository;

import com.comek.springstarter.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {

}

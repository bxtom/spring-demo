package com.comek.springstarter.demo.interfaces;

import com.comek.springstarter.demo.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    void saveBook(Book book);
}

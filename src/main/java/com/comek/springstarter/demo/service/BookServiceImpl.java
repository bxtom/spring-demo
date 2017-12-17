package com.comek.springstarter.demo.service;

import com.comek.springstarter.demo.interfaces.BookService;
import com.comek.springstarter.demo.model.Book;
import com.comek.springstarter.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BooksRepository booksRepository;

    @Override
    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    @Override
    public void saveBook(Book book) {
        booksRepository.save(book);
    }
}

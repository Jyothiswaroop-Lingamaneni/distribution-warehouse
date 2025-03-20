package com.example.demo.book.service;


import com.example.demo.book.exception.BookNotFoundException;
import com.example.demo.book.model.Book;
import com.example.demo.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    public Book updateBook(Integer id, Book updatedBook) {
        return bookRepository.findById(id).map(book -> {
            book.setPrice(updatedBook.getPrice());
            book.setYearOfPublish(updatedBook.getYearOfPublish());
            return bookRepository.save(book);
        }).orElseThrow(() -> new BookNotFoundException("Book not found with the  id " + id));
    }

}



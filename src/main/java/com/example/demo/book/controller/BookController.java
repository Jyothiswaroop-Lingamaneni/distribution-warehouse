package com.example.demo.book.controller;
import com.example.demo.book.exception.BookNotFoundException;
import com.example.demo.book.model.Book;
import com.example.demo.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getbook")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/createbook")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);

    }
    @PutMapping("/updatebook/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
        try {
            Book book = bookService.updateBook(id, updatedBook);
            return ResponseEntity.ok(book);
        }
        catch(BookNotFoundException bookNotFoundException){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    }


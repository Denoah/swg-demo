package com.example.swgdemo.book.web;

import com.example.swgdemo.book.domain.Book;
import com.example.swgdemo.book.domain.req.BookAddReq;
import com.example.swgdemo.book.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/book")
public class MainRestController {

    private final BookService bookService;

    public MainRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.findBookById(id);
    }

    @GetMapping("/")
    public Iterable<Book> getBooks() {
        return bookService.findAllBooks();
    }

    @PostMapping("/")
    public ResponseEntity addBook(@RequestBody BookAddReq req) {
        return bookService.addBook(req);
    }
}

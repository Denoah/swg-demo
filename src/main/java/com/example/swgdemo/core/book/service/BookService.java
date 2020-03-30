package com.example.swgdemo.core.book.service;

import com.example.swgdemo.core.book.domain.Book;
import com.example.swgdemo.core.book.domain.req.BookAddReq;
import com.example.swgdemo.core.book.repo.BookRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepo.findAll();
    }

    public ResponseEntity addBook(BookAddReq req) {
        try {
            Book book = new Book();
            book.setAuthor(req.getAuthor());
            book.setTitle(req.getTitle());
            bookRepo.save(book);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

    }

    public Book findBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
}

package com.example.swgdemo.core.book.web;

import com.example.swgdemo.core.book.domain.Book;
import com.example.swgdemo.core.book.domain.req.BookAddReq;
import com.example.swgdemo.core.book.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/book")
@Api(tags = "Книги", description = "Операции с книгами")
public class MainRestController {

    private final BookService bookService;

    public MainRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Книга по id", notes = "Отображение книги по id", response = Book.class)
    public Book getBook(@ApiParam(value = "id книги в БД", required = true)
            @PathVariable String id) {
        try {
            Long value = Long.parseLong(id);
            return bookService.findBookById(value);
        } catch (NumberFormatException ex) {
            return null;
        }

    }

    @GetMapping("/")
    @ApiOperation(value = "Все книги", notes = "Запрос на поиск всех книг в БД")
    public Iterable<Book> getBooks() {
        return bookService.findAllBooks();
    }

    @PostMapping("/")
    @ApiOperation(value = "Добавление книги", notes = "Добавление книги в базу данных", response = Book.class)
    public ResponseEntity addBook(@RequestBody BookAddReq req) {
        return bookService.addBook(req);
    }
}

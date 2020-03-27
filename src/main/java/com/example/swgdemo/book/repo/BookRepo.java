package com.example.swgdemo.book.repo;

import com.example.swgdemo.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}

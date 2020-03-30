package com.example.swgdemo.core.book.repo;

import com.example.swgdemo.core.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}

package main.java.com.javainuse.db;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.javainuse.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
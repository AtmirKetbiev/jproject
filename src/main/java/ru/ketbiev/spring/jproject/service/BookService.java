package ru.ketbiev.spring.jproject.service;

import ru.ketbiev.spring.jproject.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book findByUName(String name);
    List<Book> getAllBook();
    void saveBook(Book book);
    Optional<Book> getBook(int id);
    void deleteBook(int id);
    List<Book> getAllMyBook(int id);
}

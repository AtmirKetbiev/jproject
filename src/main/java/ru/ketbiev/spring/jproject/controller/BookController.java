package ru.ketbiev.spring.jproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ketbiev.spring.jproject.exceptionHandling.NoSuchException;
import ru.ketbiev.spring.jproject.model.Book;
import ru.ketbiev.spring.jproject.service.BookService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public Optional<Book> get(@PathVariable int id) {
        Book book = bookService.getBook(id).orElse(null);

        if (book == null) {
            throw new NoSuchException("User");
        }
        return bookService.getBook(id);
    }

    @GetMapping("/all/{idUser}")
    public List<Book> showMyAll(@PathVariable int idUser) {
        return bookService.getAllMyBook(idUser);
    }

    @PostMapping
    public Book addNewEmployee(@RequestBody Book book) {
        bookService.saveBook(book);
        return book;
    }

    @PutMapping
    public Book updateEmployee (@RequestBody Book book) {
        bookService.saveBook(book);
        return book;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployees(@PathVariable int id) {
        Book book = bookService.getBook(id).orElse(null);
        if (book == null) {
            throw new NoSuchException("Book");
        }
        bookService.deleteBook(id);
        return "Deleted id = " + id;
    }
}

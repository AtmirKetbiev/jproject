package ru.ketbiev.spring.jproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.dao.BookDAO;
import ru.ketbiev.spring.jproject.model.Book;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    public Book findByUName(String name) {
        return null;
    }

    @Override
    public List<Book> getAllBook() {
        return bookDAO.findAll();
    }

    @Override
    public void saveBook(Book book) {
        bookDAO.save(book);
    }

    @Override
    public Optional<Book> getBook(int id) {
        return bookDAO.findById(id);
    }

    @Override
    public void deleteBook(int id) {
        bookDAO.deleteById(id);
    }

    @Override
    public List<Book> getAllMyBook(int id) {
        return bookDAO.getAllMyBook(id);
    }
}

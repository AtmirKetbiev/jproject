package ru.ketbiev.spring.jproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.ketbiev.spring.jproject.model.Book;

import java.util.List;

@Repository
public interface BookDAO  extends JpaRepository<Book, Integer> {
    @Query("SELECT b FROM Book b WHERE b.user.id = ?1")
    List<Book> getAllMyBook(Integer id);
}
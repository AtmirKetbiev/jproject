package ru.ketbiev.spring.jproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.ketbiev.spring.jproject.model.Chapter;
import ru.ketbiev.spring.jproject.model.Note;

import java.util.List;

@Repository
public interface NoteDAO  extends JpaRepository<Note, Integer> {
    @Query("SELECT n FROM Note n WHERE n.book.id = ?1")
    List<Note> findAllMine(Integer id);
}

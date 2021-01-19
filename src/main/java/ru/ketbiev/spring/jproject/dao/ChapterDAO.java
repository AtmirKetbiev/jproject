package ru.ketbiev.spring.jproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.ketbiev.spring.jproject.model.Chapter;

import java.util.List;

@Repository
public interface ChapterDAO  extends JpaRepository<Chapter, Integer> {
    @Query("SELECT c FROM Chapter c WHERE c.book.id = ?1")
    List<Chapter> findAllMine(Integer id);
}

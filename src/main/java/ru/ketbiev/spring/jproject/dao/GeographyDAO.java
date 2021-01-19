package ru.ketbiev.spring.jproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.ketbiev.spring.jproject.model.Chapter;
import ru.ketbiev.spring.jproject.model.Geography;

import java.util.List;

@Repository
public interface GeographyDAO  extends JpaRepository<Geography, Integer> {
    @Query("SELECT g FROM Geography g WHERE g.book.id = ?1")
    List<Geography> findAllMine(Integer id);
}

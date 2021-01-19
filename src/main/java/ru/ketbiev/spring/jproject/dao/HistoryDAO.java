package ru.ketbiev.spring.jproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.ketbiev.spring.jproject.model.History;

import java.util.List;

@Repository
public interface HistoryDAO  extends JpaRepository<History, Integer> {
    @Query("SELECT h FROM History h WHERE h.book.id = ?1")
    List<History> findAllMine(Integer id);
}
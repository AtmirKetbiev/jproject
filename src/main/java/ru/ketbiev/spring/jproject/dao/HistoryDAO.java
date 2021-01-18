package ru.ketbiev.spring.jproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ketbiev.spring.jproject.model.History;

@Repository
public interface HistoryDAO  extends JpaRepository<History, Integer> {
}

package ru.ketbiev.spring.jproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ketbiev.spring.jproject.model.Chapter;

@Repository
public interface ChapterDAO  extends JpaRepository<Chapter, Integer> {
}

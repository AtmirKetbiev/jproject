package ru.ketbiev.spring.jproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.ketbiev.spring.jproject.model.Character;

import java.util.List;

@Repository
public interface CharacterDAO  extends JpaRepository<Character, Integer> {
    @Query("SELECT c FROM Character c WHERE c.book.id = ?1")
    List<Character> findAllMine(Integer id);
}

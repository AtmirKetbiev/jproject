package ru.ketbiev.spring.jproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ketbiev.spring.jproject.model.Character;

@Repository
public interface CharacterDAO  extends JpaRepository<Character, Integer> {
}

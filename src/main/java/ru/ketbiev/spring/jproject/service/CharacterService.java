package ru.ketbiev.spring.jproject.service;

import ru.ketbiev.spring.jproject.model.Character;

import java.util.List;
import java.util.Optional;

public interface CharacterService {
    Character findByUName(String name);
    List<Character> getAllCharacter();
    void saveCharacter(Character character);
    Optional<Character> getCharacter(int id);
    void deleteCharacter(int id);
}

package ru.ketbiev.spring.jproject.service;

import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.model.Character;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterServiceImp implements CharacterService{
    @Override
    public Character findByUName(String name) {
        return null;
    }

    @Override
    public List<Character> getAllCharacter() {
        return null;
    }

    @Override
    public void saveCharacter(Character character) {

    }

    @Override
    public Optional<Character> getCharacter(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteCharacter(int id) {

    }
}

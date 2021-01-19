package ru.ketbiev.spring.jproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.dao.CharacterDAO;
import ru.ketbiev.spring.jproject.model.Character;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterServiceImp implements CharacterService{

    @Autowired
    private CharacterDAO characterDAO;

    @Override
    public Character findByUName(String name) {
        return null;
    }

    @Override
    public List<Character> getAllCharacter() {
        return characterDAO.findAll();
    }

    @Override
    public void saveCharacter(Character character) {
        characterDAO.save(character);
    }

    @Override
    public Optional<Character> getCharacter(int id) {
        return characterDAO.findById(id);
    }

    @Override
    public void deleteCharacter(int id) {
        characterDAO.deleteById(id);
    }

    @Override
    public List<Character> getAllMyCharacter(int idBook) {
        return characterDAO.findAllMine(idBook);
    }
}

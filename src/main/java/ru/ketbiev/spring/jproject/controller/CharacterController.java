package ru.ketbiev.spring.jproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ketbiev.spring.jproject.exceptionHandling.NoSuchException;
import ru.ketbiev.spring.jproject.model.Character;
import ru.ketbiev.spring.jproject.service.CharacterService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "character")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/{id}")
    public Optional<Character> get(@PathVariable int id) {
        Character character = characterService.getCharacter(id).orElse(null);

        if (character == null) {
            throw new NoSuchException("User");
        }
        return characterService.getCharacter(id);
    }

    @GetMapping("/all/{idUser}")
    public List<Character> showMyAll(@PathVariable int idUser) {
        return characterService.getAllMyCharacter(idUser);
    }

    @PostMapping
    public Character addNewEmployee(@RequestBody Character character) {
        characterService.saveCharacter(character);
        return character;
    }

    @PutMapping
    public Character updateEmployee (@RequestBody Character character) {
        characterService.saveCharacter(character);
        return character;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployees(@PathVariable int id) {
        Character chapter = characterService.getCharacter(id).orElse(null);
        if (chapter == null) {
            throw new NoSuchException("Book");
        }
        characterService.deleteCharacter(id);
        return "Deleted id = " + id;
    }

}

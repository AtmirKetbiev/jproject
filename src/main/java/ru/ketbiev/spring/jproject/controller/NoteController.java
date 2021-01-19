package ru.ketbiev.spring.jproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ketbiev.spring.jproject.exceptionHandling.NoSuchException;
import ru.ketbiev.spring.jproject.model.Note;
import ru.ketbiev.spring.jproject.service.NoteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/{id}")
    public Optional<Note> get(@PathVariable int id) {
        Note note = noteService.getNote(id).orElse(null);

        if (note == null) {
            throw new NoSuchException("User");
        }
        return noteService.getNote(id);
    }

    @GetMapping("/all/{idUser}")
    public List<Note> showMyAll(@PathVariable int idUser) {
        return noteService.getAllMyNote(idUser);
    }

    @PostMapping
    public Note addNewEmployee(@RequestBody Note note) {
        noteService.saveNote(note);
        return note;
    }

    @PutMapping
    public Note updateEmployee (@RequestBody Note note) {
        noteService.saveNote(note);
        return note;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployees(@PathVariable int id) {
        Note note = noteService.getNote(id).orElse(null);
        if (note == null) {
            throw new NoSuchException("Book");
        }
        noteService.deleteNote(id);
        return "Deleted id = " + id;
    }

}

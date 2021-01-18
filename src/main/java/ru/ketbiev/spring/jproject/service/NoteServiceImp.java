package ru.ketbiev.spring.jproject.service;

import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.model.Note;

import java.util.List;
import java.util.Optional;

@Service
public class NoteServiceImp implements NoteService {
    @Override
    public Note findByUName(String name) {
        return null;
    }

    @Override
    public List<Note> getAllNote() {
        return null;
    }

    @Override
    public void saveNote(Note note) {

    }

    @Override
    public Optional<Note> getNote(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteNote(int id) {

    }
}

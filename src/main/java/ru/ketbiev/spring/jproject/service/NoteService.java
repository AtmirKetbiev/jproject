package ru.ketbiev.spring.jproject.service;

import ru.ketbiev.spring.jproject.model.Note;

import java.util.List;
import java.util.Optional;

public interface NoteService {
    Note findByUName(String name);
    List<Note> getAllNote();
    void saveNote(Note note);
    Optional<Note> getNote(int id);
    void deleteNote(int id);
}

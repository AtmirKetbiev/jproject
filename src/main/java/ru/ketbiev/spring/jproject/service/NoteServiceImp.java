package ru.ketbiev.spring.jproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.dao.NoteDAO;
import ru.ketbiev.spring.jproject.model.Note;

import java.util.List;
import java.util.Optional;

@Service
public class NoteServiceImp implements NoteService {

    @Autowired
    private NoteDAO noteDAO;

    @Override
    public Note findByUName(String name) {
        return null;
    }

    @Override
    public List<Note> getAllNote() {
        return noteDAO.findAll();
    }

    @Override
    public void saveNote(Note note) {
        noteDAO.save(note);
    }

    @Override
    public Optional<Note> getNote(int id) {
        return noteDAO.findById(id);
    }

    @Override
    public void deleteNote(int id) {
        noteDAO.deleteById(id);
    }

    @Override
    public List<Note> getAllMyNote(int idBook) {
        return noteDAO.findAllMine(idBook);
    }
}

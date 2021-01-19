package ru.ketbiev.spring.jproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.dao.ChapterDAO;
import ru.ketbiev.spring.jproject.model.Chapter;

import java.util.List;
import java.util.Optional;

@Service
public class ChapterServiceImp implements  ChapterService{

    @Autowired
    private ChapterDAO chapterDAO;

    @Override
    public Chapter findByUName(String name) {
        return null;
    }

    @Override
    public List<Chapter> getAllChapter() {
        return chapterDAO.findAll();
    }

    @Override
    public void saveChapter(Chapter chapter) {
        chapterDAO.save(chapter);
    }

    @Override
    public Optional<Chapter> getChapter(int id) {
        return chapterDAO.findById(id);
    }

    @Override
    public void deleteChapter(int id) {
        chapterDAO.deleteById(id);
    }

    @Override
    public List<Chapter> getAllMyChapter(int idBook) {
        return chapterDAO.findAllMine(idBook);
    }
}

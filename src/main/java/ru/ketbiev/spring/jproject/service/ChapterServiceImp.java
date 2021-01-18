package ru.ketbiev.spring.jproject.service;

import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.model.Chapter;

import java.util.List;
import java.util.Optional;

@Service
public class ChapterServiceImp implements  ChapterService{
    @Override
    public Chapter findByUName(String name) {
        return null;
    }

    @Override
    public List<Chapter> getAllChapter() {
        return null;
    }

    @Override
    public void saveChapter(Chapter chapter) {

    }

    @Override
    public Optional<Chapter> getChapter(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteChapter(int id) {

    }
}

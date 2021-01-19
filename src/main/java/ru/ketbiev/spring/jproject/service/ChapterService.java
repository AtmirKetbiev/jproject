package ru.ketbiev.spring.jproject.service;

import ru.ketbiev.spring.jproject.model.Chapter;

import java.util.List;
import java.util.Optional;

public interface ChapterService {
    Chapter findByUName(String name);
    List<Chapter> getAllChapter();
    void saveChapter(Chapter chapter);
    Optional<Chapter> getChapter(int id);
    void deleteChapter(int id);
    List<Chapter> getAllMyChapter(int idBook);
}

package ru.ketbiev.spring.jproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ketbiev.spring.jproject.exceptionHandling.NoSuchException;
import ru.ketbiev.spring.jproject.model.Chapter;
import ru.ketbiev.spring.jproject.service.ChapterService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "chapter")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @GetMapping("/{id}")
    public Optional<Chapter> get(@PathVariable int id) {
        Chapter chapter = chapterService.getChapter(id).orElse(null);

        if (chapter == null) {
            throw new NoSuchException("User");
        }
        return chapterService.getChapter(id);
    }

    @GetMapping("/all/{idUser}")
    public List<Chapter> showMyAll(@PathVariable int idUser) {
        return chapterService.getAllMyChapter(idUser);
    }

    @PostMapping
    public Chapter addNewEmployee(@RequestBody Chapter chapter) {
        chapterService.saveChapter(chapter);
        return chapter;
    }

    @PutMapping
    public Chapter updateEmployee (@RequestBody Chapter chapter) {
        chapterService.saveChapter(chapter);
        return chapter;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployees(@PathVariable int id) {
        Chapter chapter = chapterService.getChapter(id).orElse(null);
        if (chapter == null) {
            throw new NoSuchException("Book");
        }
        chapterService.deleteChapter(id);
        return "Deleted id = " + id;
    }
}

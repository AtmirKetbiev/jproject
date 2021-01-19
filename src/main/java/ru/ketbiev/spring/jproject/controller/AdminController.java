package ru.ketbiev.spring.jproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ketbiev.spring.jproject.model.*;
import ru.ketbiev.spring.jproject.model.Character;
import ru.ketbiev.spring.jproject.service.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private BookService bookService;

    @Autowired
    private ChapterService chapterService;

    @Autowired
    private CharacterService characterService;

    @Autowired
    private GeographyService geographyService;

    @Autowired
    private HistoryService historyService;

    @Autowired
    private NoteService noteService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @GetMapping("/books")
    public List<Book> showAllBooks() {
        return bookService.getAllBook();
    }

    @GetMapping("/chapters")
    public List<Chapter> showAllChapters() {
        return chapterService.getAllChapter();
    }

    @GetMapping("/characters")
    public List<Character> showAllCharacter() {
        return characterService.getAllCharacter();
    }

    @GetMapping("/geographys")
    public List<Geography> showAllGeography() {
        return geographyService.getAllGeography();
    }

    @GetMapping("/historys")
    public List<History> showAllHistory() {
        return historyService.getAllHistory();
    }

    @GetMapping("/notes")
    public List<Note> showAllNote() {
        return noteService.getAllNote();
    }

    @GetMapping("/roles")
    public List<Role> showAllRole() {
        return roleService.getAllRole();
    }

    @GetMapping("/users")
    public List<User> showAllUser() {
        return userService.getAllUser();
    }
}

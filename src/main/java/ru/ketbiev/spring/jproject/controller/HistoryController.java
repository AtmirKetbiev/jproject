package ru.ketbiev.spring.jproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ketbiev.spring.jproject.exceptionHandling.NoSuchException;
import ru.ketbiev.spring.jproject.model.History;
import ru.ketbiev.spring.jproject.service.HistoryService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "history")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping("/{id}")
    public Optional<History> get(@PathVariable int id) {
        History history = historyService.getHistory(id).orElse(null);

        if (history == null) {
            throw new NoSuchException("User");
        }
        return historyService.getHistory(id);
    }

    @GetMapping("/all/{idUser}")
    public List<History> showMyAll(@PathVariable int idUser) {
        return historyService.getAllMyHistory(idUser);
    }

    @PostMapping
    public History addNewEmployee(@RequestBody History history) {
        historyService.saveHistory(history);
        return history;
    }

    @PutMapping
    public History updateEmployee (@RequestBody History history) {
        historyService.saveHistory(history);
        return history;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployees(@PathVariable int id) {
        History history = historyService.getHistory(id).orElse(null);
        if (history == null) {
            throw new NoSuchException("Book");
        }
        historyService.deleteHistory(id);
        return "Deleted id = " + id;
    }

}

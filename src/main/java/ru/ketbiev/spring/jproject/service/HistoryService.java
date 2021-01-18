package ru.ketbiev.spring.jproject.service;

import ru.ketbiev.spring.jproject.model.History;

import java.util.List;
import java.util.Optional;

public interface HistoryService {
    History findByUName(String name);
    List<History> getAllHistory();
    void saveHistory(History history);
    Optional<History> getHistory(int id);
    void deleteHistory(int id);
}

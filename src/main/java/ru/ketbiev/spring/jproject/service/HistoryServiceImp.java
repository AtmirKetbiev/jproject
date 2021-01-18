package ru.ketbiev.spring.jproject.service;

import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.model.History;

import java.util.List;
import java.util.Optional;

@Service
public class HistoryServiceImp implements HistoryService{
    @Override
    public History findByUName(String name) {
        return null;
    }

    @Override
    public List<History> getAllHistory() {
        return null;
    }

    @Override
    public void saveHistory(History history) {

    }

    @Override
    public Optional<History> getHistory(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteHistory(int id) {

    }
}

package ru.ketbiev.spring.jproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.dao.HistoryDAO;
import ru.ketbiev.spring.jproject.model.History;

import java.util.List;
import java.util.Optional;

@Service
public class HistoryServiceImp implements HistoryService{

    @Autowired
    private HistoryDAO historyDAO;

    @Override
    public History findByUName(String name) {
        return null;
    }

    @Override
    public List<History> getAllHistory() {
        return historyDAO.findAll();
    }

    @Override
    public void saveHistory(History history) {
        historyDAO.save(history);
    }

    @Override
    public Optional<History> getHistory(int id) {
        return historyDAO.findById(id);
    }

    @Override
    public void deleteHistory(int id) {
        historyDAO.deleteById(id);
    }

    @Override
    public List<History> getAllMyHistory(int idBook) {
        return historyDAO.findAllMine(idBook);
    }
}

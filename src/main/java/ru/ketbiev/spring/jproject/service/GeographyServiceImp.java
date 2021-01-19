package ru.ketbiev.spring.jproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.dao.GeographyDAO;
import ru.ketbiev.spring.jproject.model.Geography;

import java.util.List;
import java.util.Optional;

@Service
public class GeographyServiceImp implements GeographyService{

    @Autowired
    private GeographyDAO geographyDAO;

    @Override
    public Geography findByUName(String name) {
        return null;
    }

    @Override
    public List<Geography> getAllGeography() {
        return geographyDAO.findAll();
    }

    @Override
    public void saveGeography(Geography geography) {
        geographyDAO.save(geography);
    }

    @Override
    public Optional<Geography> getGeography(int id) {
        return geographyDAO.findById(id);
    }

    @Override
    public void deleteGeography(int id) {
        geographyDAO.deleteById(id);
    }

    @Override
    public List<Geography> getAllMyGeography(int idBook) {
        return geographyDAO.findAllMine(idBook);
    }
}

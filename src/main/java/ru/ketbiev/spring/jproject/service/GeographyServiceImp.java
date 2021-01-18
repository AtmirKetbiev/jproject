package ru.ketbiev.spring.jproject.service;

import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.model.Geography;

import java.util.List;
import java.util.Optional;

@Service
public class GeographyServiceImp implements GeographyService{
    @Override
    public Geography findByUName(String name) {
        return null;
    }

    @Override
    public List<Geography> getAllGeography() {
        return null;
    }

    @Override
    public void saveGeography(Geography geography) {

    }

    @Override
    public Optional<Geography> getGeography(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteGeography(int id) {

    }
}

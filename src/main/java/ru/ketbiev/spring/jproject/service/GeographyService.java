package ru.ketbiev.spring.jproject.service;

import ru.ketbiev.spring.jproject.model.Geography;

import java.util.List;
import java.util.Optional;

public interface GeographyService {
    Geography findByUName(String name);
    List<Geography> getAllGeography();
    void saveGeography(Geography geography);
    Optional<Geography> getGeography(int id);
    void deleteGeography(int id);
}

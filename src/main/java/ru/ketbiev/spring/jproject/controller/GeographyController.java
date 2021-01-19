package ru.ketbiev.spring.jproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ketbiev.spring.jproject.exceptionHandling.NoSuchException;
import ru.ketbiev.spring.jproject.model.Geography;
import ru.ketbiev.spring.jproject.service.GeographyService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "geography")
public class GeographyController {

    @Autowired
    private GeographyService geographyService;

    @GetMapping("/{id}")
    public Optional<Geography> get(@PathVariable int id) {
        Geography geography = geographyService.getGeography(id).orElse(null);

        if (geography == null) {
            throw new NoSuchException("User");
        }
        return geographyService.getGeography(id);
    }

    @GetMapping("/all/{idUser}")
    public List<Geography> showMyAll(@PathVariable int idUser) {
        return geographyService.getAllMyGeography(idUser);
    }

    @PostMapping
    public Geography addNewEmployee(@RequestBody Geography geography) {
        geographyService.saveGeography(geography);
        return geography;
    }

    @PutMapping
    public Geography updateEmployee (@RequestBody Geography geography) {
        geographyService.saveGeography(geography);
        return geography;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployees(@PathVariable int id) {
        Geography geography = geographyService.getGeography(id).orElse(null);
        if (geography == null) {
            throw new NoSuchException("Book");
        }
        geographyService.deleteGeography(id);
        return "Deleted id = " + id;
    }

}

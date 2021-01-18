package ru.ketbiev.spring.jproject.service;

import ru.ketbiev.spring.jproject.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User findByUsername(String username);
    List<User> getAllUser();
    void saveUser(User user);
    Optional<User> getUser(int id);
    void deleteUser(int id);
}

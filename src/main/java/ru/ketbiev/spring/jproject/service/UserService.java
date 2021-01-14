package ru.ketbiev.spring.jproject.service;

import ru.ketbiev.spring.jproject.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User findByUsername(String username);
    public List<User> getAllUser();
    public void saveUser(User user);
    public Optional<User> getUser(Long id);
    public void deleteUser(Long id);
}

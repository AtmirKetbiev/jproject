package ru.ketbiev.spring.jproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.dao.UserDAO;
import ru.ketbiev.spring.jproject.model.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return userDAO.findAll();
    }

    @Override
    public void saveUser(User user) {
        userDAO.save(user);
    }

    @Override
    public Optional<User> getUser(Long id){
        return userDAO.findById(id);
    }

    @Override
    public void deleteUser(Long id) {
        userDAO.deleteById(id);
    }
}
package ru.ketbiev.spring.jproject.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import ru.ketbiev.spring.jproject.dao.UserDAO;
import ru.ketbiev.spring.jproject.model.User;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

class UserServiceImpTest {

    @Mock
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserService userService;

    @Test
    void findByUsername() {
    }

    @Test
    void getAllUser() {
        given(userDAO.findById(1L).orElse(null)).willReturn(
                new User());
    }

    @Test
    void saveUser() {
    }

    @Test
    void getUser() {
    }

    @Test
    void deleteUser() {
    }
}
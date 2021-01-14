package ru.ketbiev.spring.jproject.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.ketbiev.spring.jproject.model.Role;
import ru.ketbiev.spring.jproject.model.User;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserDAOTest {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RoleDAO roleDAO;

    @Test
    public void  findByIdTest() {
        User u = userDAO.findById(1L).orElse(null);
        assertThat(u).isNotNull();
        assertThat(u.getUsername()).isEqualTo("zaur");
        assertThat(u.getRoles().contains(roleDAO.findById(2L).orElse(null)));
    }

    @Test
    public void saveTest() {
        User user = new User();
        user.setUsername("qqq");
        user.setPassword("{noop}qqq");

        Role role = roleDAO.findById(1L).orElse(null);
        Set<Role> roles = new HashSet();
        roles.add(role);
        user.setRoles(roles);

        userDAO.save(user);
    }

    @Test
    public void deleteTest() {
        userDAO.deleteById(24L);
        assertThat(userDAO.findById(24L).orElse(null)).isNull();
    }

}
package ru.ketbiev.spring.jproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ketbiev.spring.jproject.exceptionHandling.NoSuchException;
import ru.ketbiev.spring.jproject.model.Role;
import ru.ketbiev.spring.jproject.model.User;
import ru.ketbiev.spring.jproject.service.RoleService;
import ru.ketbiev.spring.jproject.service.UserService;

import java.util.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @GetMapping("/users")
    public List<User> showAllEmployees() {
        return userService.getAllUser();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getEmployees(@PathVariable int id) {
        User user = userService.getUser(id).orElse(null);

        if (user == null) {
            throw new NoSuchException("User");
        }
        return userService.getUser(id);
    }

    @PostMapping("/users")
    public User addNewEmployee(@RequestBody User user) {
        Role role = roleService.findByRole("ROLE_USER");
        Set<Role> roles = new HashSet();
        roles.add(role);
        user.setRoles(roles);
        userService.saveUser(user);
        return user;
    }

    @PutMapping("/users")
    public User updateEmployee (@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public String deleteEmployees(@PathVariable int id) {
        User user = userService.getUser(id).orElse(null);

        if (user == null) {
            throw new NoSuchException("User");
        }

        userService.deleteUser(id);
        return "Deleted id = " + id;
    }
}

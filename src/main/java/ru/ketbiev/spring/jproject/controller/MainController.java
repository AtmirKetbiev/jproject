package ru.ketbiev.spring.jproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ketbiev.spring.jproject.model.Role;
import ru.ketbiev.spring.jproject.model.User;
import ru.ketbiev.spring.jproject.service.RoleService;
import ru.ketbiev.spring.jproject.service.UserService;

import java.util.*;

@RestController
@RequestMapping("api")
public class MainController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @GetMapping("/employees")
    public List<User> showAllEmployees() {
        return userService.getAllUser();
    }

    @GetMapping("/employees/{id}")
    public Optional<User> getEmployees(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/employees")
    public User addNewEmployee(@RequestBody User user) {
        Role role = roleService.findByRole("ROLE_USER");
        Set<Role> roles = new HashSet();
        roles.add(role);
        user.setRoles(roles);
        userService.saveUser(user);
        return user;
    }

    @PutMapping("/employees")
    public User updateEmployee (@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployees(@PathVariable Long id) {
        userService.deleteUser(id);
        return "Deleted id = " + id;
    }
}

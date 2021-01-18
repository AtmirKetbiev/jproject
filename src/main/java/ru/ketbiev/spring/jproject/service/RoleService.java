package ru.ketbiev.spring.jproject.service;

import ru.ketbiev.spring.jproject.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    Role findByRole(String username);
    List<Role> getAllRole();
    void saveRole(Role role);
    Optional<Role> getRole(int id);
    void deleteRole(int id);
}

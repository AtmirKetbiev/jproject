package ru.ketbiev.spring.jproject.service;

import ru.ketbiev.spring.jproject.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    public Role findByRole(String username);
    public List<Role> getAllRole();
    public void saveRole(Role role);
    public Optional<Role> getRole(Long id);
    public void deleteRole(Long id);
}

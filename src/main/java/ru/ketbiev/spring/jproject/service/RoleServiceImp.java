package ru.ketbiev.spring.jproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ketbiev.spring.jproject.dao.RoleDAO;
import ru.ketbiev.spring.jproject.dao.UserDAO;
import ru.ketbiev.spring.jproject.model.Role;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    private RoleDAO roleDAO;

    @Override
    public Role findByRole(String username) {
        return null;
    }

    @Override
    public List<Role> getAllRole() {
        return roleDAO.findAll();
    }

    @Override
    public void saveRole(Role role) {
        roleDAO.save(role);
    }

    @Override
    public Optional<Role> getRole(Long id) {
        return roleDAO.findById(id);
    }

    @Override
    public void deleteRole(Long id) {
        roleDAO.deleteById(id);
    }
}

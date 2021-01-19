package ru.ketbiev.spring.jproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ketbiev.spring.jproject.model.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Integer> {
}
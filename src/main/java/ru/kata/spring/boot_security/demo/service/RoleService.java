package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

@Service
public interface RoleService {

    Role getRole(String name);

    void addRole(Role role);

    List<Role> getAllRoles();

}

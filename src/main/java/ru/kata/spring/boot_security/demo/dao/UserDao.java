package ru.kata.spring.boot_security.demo.dao;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao {

    void addUser(User user);

    User findUser(Integer id);

    void updateUser(User user);

    void deleteUser(Integer id);

    List<User> getAllUsers();

    User findByUsername(String username);

    @Transactional
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}

package net.zerotodev.api.user.service;

import net.zerotodev.api.user.domain.User;
import net.zerotodev.api.user.domain.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {
    List<User> findAll();
    Optional<User> findById(long id);
    void save(User user);
    boolean existsById(long id);
    long count();
    void deleteById(long id);
    String signup(User user);
    UserDto signin(User user);

}

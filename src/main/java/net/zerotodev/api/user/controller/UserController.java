package net.zerotodev.api.user.controller;

import net.zerotodev.api.user.domain.User;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    public List<User> findAll() {
        return null;
    }

    public Optional<User> findById(@PathVariable long id) {
        return Optional.empty();
    }

    public void save(User user) {

    }
    public void update(User user){

    }

    public boolean existsById(long id) {
        return false;
    }

    public long count() {
        return 0;
    }

    public void deleteById(long id) {

    }

}

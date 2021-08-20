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
    @GetMapping
    public List<User> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(User user) {

    }
    @PutMapping
    public void update(User user){

    }

    @GetMapping("/exists/{id}")
    public boolean existsById(long id) {
        return false;
    }

    @GetMapping("/count")
    public long count() {
        return 0;
    }

    @DeleteMapping
    public void deleteById(long id) {

    }

}

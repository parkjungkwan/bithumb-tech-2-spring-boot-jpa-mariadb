package net.zerotodev.api.order.controller;

import net.zerotodev.api.order.domain.Item;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {
    @GetMapping
    public List<Item> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<Item> findById(@PathVariable long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(Item order) {

    }
    @PutMapping
    public void update(Item order){

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

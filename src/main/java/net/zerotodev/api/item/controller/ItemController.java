package net.zerotodev.api.item.controller;

import lombok.RequiredArgsConstructor;
import net.zerotodev.api.item.domain.Item;
import net.zerotodev.api.item.service.ItemService;
import net.zerotodev.api.order.domain.Order;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;
    @GetMapping
    public List<Item> findAll() {
        return itemService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Item> findById(@PathVariable long id) {
        return itemService.findById(id);
    }
    @PostMapping
    public void save(@RequestBody Item item) {
        itemService.save(item);
    }
    @PutMapping
    public void update(@RequestBody Item item){
        itemService.save(item);
    }
    @GetMapping("/exists")
    public boolean existsById(long id) {
        return itemService.existsById(id);
    }
    @GetMapping("/count")
    public long count() {
        return itemService.count();
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        itemService.deleteById(id);
    }
    @DeleteMapping
    public void deleteAll(){
        itemService.deleteAll();
    }


}

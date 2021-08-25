package net.zerotodev.api.item.service;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import net.zerotodev.api.item.domain.Item;
import net.zerotodev.api.item.repository.ItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;

import static org.mockito.Mockito.verify;
import java.util.List;
import static org.mockito.BDDMockito.given;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootConfiguration
@ExtendWith(MockitoExtension.class)
class ItemServiceImplTest {
    @Autowired private ItemServiceImpl itemService;
    @Autowired private ItemRepository itemRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        itemService = new ItemServiceImpl(itemRepository);
    }

    @Test
    void findAll() {
        // String itemBrand, String itemName,String itemColor
        Item item = Item.builder().itemBrand("A").itemName("B").itemColor("C").build();
        assertThat(item.getItemName(), is(equalTo("B")));
        itemService.save(item);
        verify(itemRepository).save(item);
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void existsById() {
    }

    @Test
    void count() {
    }

    @Test
    void deleteAll() {
    }

    @Test
    void deleteById() {
    }
}
package com.project.coffee.controller;

import com.project.coffee.model.Category;
import com.project.coffee.model.Item;
import com.project.coffee.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping("/create")
    public Item create (@RequestBody Item item) {
        return itemService.create(item);
    }

    @GetMapping("/getByCategory")
    public List <Item> getByCategory(String category) {
        return itemService.getByCategory(category);
    }

    @GetMapping("/getAll")
    public List <Item> getAll() {
        return itemService.getAll();
    }

    @PostMapping("/update")
    public Item update (@RequestBody Item item) {
        return itemService.update(item);
    }

    @DeleteMapping("/delete")
    public void deleteItem(@RequestBody Item item) {
        itemService.deleteItem(item);
    }
}

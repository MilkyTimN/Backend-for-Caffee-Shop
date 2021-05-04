package com.project.coffee.service;

import com.project.coffee.model.Category;
import com.project.coffee.model.Item;
import com.project.coffee.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImplements implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item create(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getByCategory(String category) {
        return itemRepository.findAll().stream().filter(x -> x.getCategory().getName().equals(category)).collect(Collectors.toList());
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item update(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(Item item) {
        itemRepository.delete(item);
    }
}

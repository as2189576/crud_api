package com.example.crud_api.controller;

import com.example.crud_api.dto.ItemDTO;
import com.example.crud_api.entity.Item;
import com.example.crud_api.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService service;

    @PostMapping
    public Item createItem(@RequestBody ItemDTO itemDTO) {
        return service.createItem(itemDTO);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return service.getItemById(id);
    }
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody ItemDTO itemDTO) {
        return service.updateItem(id, itemDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        service.deleteItem(id);
    }

    @DeleteMapping
    public void deleteAllItems() {
        service.deleteAllItems();
}
}

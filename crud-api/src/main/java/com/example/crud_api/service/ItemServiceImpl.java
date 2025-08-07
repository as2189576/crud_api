package com.example.crud_api.service;

import com.example.crud_api.dto.ItemDTO;
import com.example.crud_api.entity.Item;
import com.example.crud_api.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository repository;

    @Override
    public Item createItem(ItemDTO itemDTO) {
        Item item = new Item();
        item.setName(itemDTO.getName());
        item.setDescription(itemDTO.getDescription());
        return repository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return repository.findAll();
    }
    @Override
    public Item getItemById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
    }

    @Override
    public Item updateItem(Long id, ItemDTO itemDTO) {
        Item item = getItemById(id);
        item.setName(itemDTO.getName());
        item.setDescription(itemDTO.getDescription());
        return repository.save(item);
    }

    @Override
    public void deleteItem(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAllItems() {
        repository.deleteAll();
}
}

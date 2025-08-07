
package com.example.crud_api.service;

import com.example.crud_api.dto.ItemDTO;
import com.example.crud_api.entity.Item;

import java.util.List;

public interface ItemService {
    Item createItem(ItemDTO itemDTO);
    List<Item> getAllItems();
    Item getItemById(Long id);
    Item updateItem(Long id, ItemDTO itemDTO);
    void deleteItem(Long id);
    void deleteAllItems();
}
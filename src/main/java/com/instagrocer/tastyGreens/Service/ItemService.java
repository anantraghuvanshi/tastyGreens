package com.instagrocer.tastyGreens.Service;

import com.instagrocer.tastyGreens.Entity.Item;
import com.instagrocer.tastyGreens.Repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;

public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getCatalogItems() {
        return itemRepository.findAll();
    }

    public List<Item> getCatalogItemsByType(String type) {
        return itemRepository.findByType(type);
    }

    public void placeOrder(List<Item> items) {
        for (Item item : items) {
            itemRepository.save(item);
        }
    }
    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        for (Item item : itemRepository.findAll()) {
            items.add(item);
        }
        return items;
    }

    public void addItem(Item item) {
        itemRepository.save(item);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(String.valueOf(id));
    }

    public void updateItem(Long id, Item item) {
        itemRepository.save(item);
    }

}


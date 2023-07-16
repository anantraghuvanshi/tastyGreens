package com.instagrocer.tastyGreens.Controller;

import com.instagrocer.tastyGreens.Entity.Item;
import com.instagrocer.tastyGreens.Service.ItemService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ItemController {

    private ItemService itemService;
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @GetMapping("/catalog")
    public List<Item> getCatalogItems() {
        return itemService.getCatalogItems();
    }
    @GetMapping("/catalog/type/{type}")
    public List<Item> getCatalogItemsByType(@PathVariable String type) {
        return itemService.getCatalogItemsByType(type);
    }
    @GetMapping("/admin/items")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }


    @PostMapping("/order")
    public void placeOrder(@RequestBody List<Item> items) {
        itemService.placeOrder(items);
    }
    @PostMapping("/admin/item")
    @PreAuthorize("hasRole('ADMIN')")
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }
    @DeleteMapping("/admin/item/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }

    @PutMapping("/admin/item/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void updateItem(@PathVariable Long id, @RequestBody Item item) {
        itemService.updateItem(id, item);
    }

}

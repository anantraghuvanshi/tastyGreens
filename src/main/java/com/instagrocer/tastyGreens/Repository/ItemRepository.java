package com.instagrocer.tastyGreens.Repository;

import com.instagrocer.tastyGreens.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public interface ItemRepository extends JpaRepository<Item, String> {
    public default List<Item> findByType(String type) {
        return findAll().stream()
                .filter(item -> item.getType().equals(type))
                .collect(Collectors.toList());
    }


}

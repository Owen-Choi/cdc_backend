package com.example.kea_domain.controller;


import com.example.kea_domain.domain.Data;
import com.example.kea_domain.domain.Item;
import com.example.kea_domain.repository.DataRepository;
import com.example.kea_domain.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;
    private final DataRepository dataRepository;

    @PostMapping("/api/item")
    public String add(@RequestBody Item item) {
        itemRepository.save(item);
        return "update OK";
    }
    @GetMapping("/api/item")
    public List< Item > get(){
        return itemRepository.findAll();
    }
    @GetMapping("/api/item/{id}")
    public Optional<Item> getId(@PathVariable("id") Long id){
        return itemRepository.findById(id);
    }

    @PostMapping("/api/data")
    public String add(@RequestBody Data data) {
        log.error(data.toString());
        dataRepository.save(data);
        return "insert";
    }

}

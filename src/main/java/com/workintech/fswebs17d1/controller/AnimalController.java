package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/workintech/animal")
public class AnimalController {
    private Map<Integer, Animal> animals;

    @PostConstruct
    public void loadAll() {
        System.out.println("Animal Controller ran");
        this.animals = new HashMap<>();
        this.animals.put(1, new Animal(1, "Maymun"));
    }

    @GetMapping
    public List<Animal> getAnimals() {
        System.out.println("---Animals triggered");
        return new ArrayList<>(animals.values());
    }

    @GetMapping
    public Animal getAnimal(@PathVariable("id") int id) {
        if (id < 0) {
            System.out.println("id cant be lower than 0");
            return null;
        }
        return this.animals.get(id);
    }


}

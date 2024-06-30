package com.guzql.blog.service;

import com.guzql.blog.entity.Coffee;
import com.guzql.blog.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CoffeeService {

    @Autowired
    CoffeeRepository coffeeRepository;

    public List<Coffee> getAllCoffee() {
        List<Coffee> coffee = new ArrayList<>();
        coffeeRepository.findAll().forEach(coffee::add);
        return coffee;
    }

    public Coffee getCoffeeById(long id) {
        return coffeeRepository.findById(id).get();
    }

    public void saveOrUpdate(Coffee coffee) {
        coffeeRepository.save(coffee);
    }

    public void delete(long id) {
        coffeeRepository.deleteById(id);
    }

    public void update(Coffee coffee, int coffeeid) {
        coffeeRepository.save(coffee);
    }

    // Optional: Filter coffee by name in the service layer
    public List<Coffee> filterCoffeeByName(String coffeename) {
        return getAllCoffee().stream()
                .filter(coffee -> coffee.getCoffeename().toLowerCase().contains(coffeename.toLowerCase()))
                .collect(Collectors.toList());
    }
}

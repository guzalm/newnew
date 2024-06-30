package com.guzql.blog.controller;

import com.guzql.blog.entity.Coffee;
import com.guzql.blog.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CoffeeController {

    @Autowired
    CoffeeService coffeeService;

    @GetMapping("/coffee")
    public String getAllCoffee(@RequestParam(required = false) String coffeename, Model model) {
        List<Coffee> coffeeList = coffeeService.getAllCoffee();

        if (coffeename != null && !coffeename.isEmpty()) {
            coffeeList = coffeeList.stream()
                    .filter(coffee -> coffee.getCoffeename().toLowerCase().contains(coffeename.toLowerCase()))
                    .collect(Collectors.toList());
        }

        model.addAttribute("coffeeList", coffeeList);
        return "coffee";
    }

    @GetMapping("/coffee/new")
    public String newCoffeeForm(Model model) {
        Coffee coffee = new Coffee();
        model.addAttribute("coffee", coffee);
        return "new_coffee";
    }

    @PostMapping("/coffee")
    public String saveCoffee(@ModelAttribute("coffee") Coffee coffee) {
        coffeeService.saveOrUpdate(coffee);
        return "redirect:/coffee";
    }

    @GetMapping("/coffee/delete/{coffeeid}")
    public String deleteCoffee(@PathVariable("coffeeid") int coffeeid) {
        coffeeService.delete(coffeeid);
        return "redirect:/coffee";
    }
}

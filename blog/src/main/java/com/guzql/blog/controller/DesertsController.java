package com.guzql.blog.controller;

import ch.qos.logback.core.model.Model;
import com.guzql.blog.entity.Coffee;
import com.guzql.blog.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DesertsController {

    @Autowired
    private CoffeeRepository coffeeRepository;
    @GetMapping("/deserts")
    public String desertsMain(Model model){
        return "deserts";
    }

//    @GetMapping("/deserts/add")
//    public String desertsAdd(Model model){
//        return "deserts-add";
//    }
//
//    @PostMapping("/deserts/add")
//    public String dessertsPostAdd(@RequestParam String title, @RequestParam String price, @RequestParam String full_text, Model model){
//        Coffee coffee = new Coffee(title, price, full_text);
//        coffeeRepository.save(coffee);
//        return "redirect:/deserts";
//    }

}

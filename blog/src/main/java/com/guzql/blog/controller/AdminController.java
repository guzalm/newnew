package com.guzql.blog.controller;

import com.guzql.blog.entity.Coffee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/add-dessert")
    public String showAddDessertForm(Model model) {
        model.addAttribute("dessert", new Coffee());
        return "add-dessert";
    }

    @PostMapping("/admin/add-dessert")
    public String addDessert(@ModelAttribute Coffee coffee) {
        // Логика добавления десерта
        return "redirect:/main";
    }
}

package com.guzql.blog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import com.guzql.blog.entity.Client;
import com.guzql.blog.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BlogController {
    private final ClientRepository clientRepository;

    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable<Client> clients = clientRepository.findAll();
        model.addAttribute("clients", clients);
        return "blog-main";
    }
}

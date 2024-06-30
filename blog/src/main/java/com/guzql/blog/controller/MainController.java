package com.guzql.blog.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String mainPage(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String role = auth.getAuthorities().iterator().next().getAuthority();

        if (role.equals("ROLE_ADMIN")) {
            model.addAttribute("isAdmin", true);
        } else {
            model.addAttribute("isAdmin", false);
        }
        return "main";
    }
}

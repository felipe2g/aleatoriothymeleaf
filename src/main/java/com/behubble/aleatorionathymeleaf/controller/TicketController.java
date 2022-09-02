package com.behubble.aleatorionathymeleaf.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicketController {
    @GetMapping
    public String generateTicket(Model model) {
        Random random = new Random();

        model.addAttribute("n1", String.valueOf(random.nextInt(25)));
        model.addAttribute("n2", String.valueOf(random.nextInt(25)));
        model.addAttribute("n3", String.valueOf(random.nextInt(25)));
        model.addAttribute("n4", String.valueOf(random.nextInt(25)));
        model.addAttribute("n5", String.valueOf(random.nextInt(25)));
        model.addAttribute("n6", String.valueOf(random.nextInt(25)));

        return "index";
    }
}

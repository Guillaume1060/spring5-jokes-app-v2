package com.udemy.jokesapp.controllers;

import com.udemy.jokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    // @RequestMapping({"/",""})
    public String showJoke (Model model) {
        String joke = jokeService.getJoke();
        model.addAttribute("joke",joke);
        return"index";
    }

}

package com.example.superheropage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperHeroController {
    @RequestMapping("/superhero")
    public String greeting(Model model) {
        model.addAttribute("name", " Water Man");
        model.addAttribute("power1", "Drown his enemies");
        model.addAttribute("power2", "Solve the clean water crisis");
        model.addAttribute("power3", "Make himself into different shapes");
        model.addAttribute("fact1", "Ability to sustain life");
        model.addAttribute("fact2", "Contains hydrogen molecules");
        model.addAttribute("fact3", "  ");

        return "hero"; //Return "hero" to tell spring to use the hero.html template
    }
}

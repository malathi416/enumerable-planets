package org.launchcode.enumerableplanets.controllers;

import org.launchcode.enumerableplanets.data.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class PlanetController {

    @GetMapping
    public String displayIndex(Model model) {
//        ArrayList<Planets> planets = new ArrayList<>();
//        planets.add(Planets.MERCURY);
        model.addAttribute("planets", Planets.values());
        return "index";
    }
}

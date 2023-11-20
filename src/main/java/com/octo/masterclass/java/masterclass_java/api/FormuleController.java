package com.octo.masterclass.java.masterclass_java.api;

import com.octo.masterclass.java.masterclass_java.restaurant.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/Formule")
public class FormuleController {

    final RestaurantService service;

    Formule midi = new Formule("Midi", List.of(
            new Entree("Bruschetta Di Pomodora", 6.90, List.of(
                    new Ingredient("Tartare de tomate", false, 0),
                    new Ingredient("Echalotes", false, 1),
                    new Ingredient("Parmigiano Reggiano", false, 0)
            ), true),
            new Plat("Risotto al Sapore di Mare",14.80, List.of()),
            new Dessert("Tiramisu", 4.90, List.of(), false)
    ));

    Formule pizza = new Formule("Pizza", List.of(
            new Plat("Margherita", 8.00, List.of()),
            new Plat("Insalata di frutti", 4.60, List.of())
    ));

    List<Formule> formules = List.of(midi, pizza);

    public FormuleController(RestaurantService service){this.service = service; }

    @GetMapping
    List<Formule> getFormules(){
        return formules;
    }

    @GetMapping("/prix")
    Double getPrixFormuleMidi() {
        return service.calculerPrixFormule(midi);
    }
}


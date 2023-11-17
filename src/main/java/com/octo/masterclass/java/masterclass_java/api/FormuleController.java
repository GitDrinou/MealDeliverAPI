package com.octo.masterclass.java.masterclass_java.api;

import com.octo.masterclass.java.masterclass_java.restaurant.Formule;
import com.octo.masterclass.java.masterclass_java.restaurant.Ingredient;
import com.octo.masterclass.java.masterclass_java.restaurant.Plat;
import com.octo.masterclass.java.masterclass_java.restaurant.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/Formule")
public class FormuleController {

    final RestaurantService service;

    Formule mezzogiorno = new Formule("Mezzogiorno", List.of(
            new Plat("Bruschetta Di Pomodora", 6.90, List.of(
                    new Ingredient("Tartare de tomate", false, 0),
                    new Ingredient("Echalotes", false, 1),
                    new Ingredient("Parmigiano Reggiano", false, 0)
            )),
            new Plat("Risotto al Sapore di Mare",14.80, List.of())
    ));
    Formule pizza = new Formule("Pizza", List.of());

    List<Formule> carte = List.of(mezzogiorno, pizza);

    public FormuleController(RestaurantService service){this.service = service; }

    @GetMapping
    List<Formule> getFormules(){
        return carte;
    }

    @GetMapping("/prix")
    Double getPrixMezzo() {
        return service.calculerPrixFormule(mezzogiorno);
    }
}


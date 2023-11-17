package com.octo.masterclass.java.masterclass_java.api;

import com.octo.masterclass.java.masterclass_java.restaurant.Formule;
import com.octo.masterclass.java.masterclass_java.restaurant.Plat;
import com.octo.masterclass.java.masterclass_java.restaurant.RestaurantService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/formule")
public class FormuleController {

    //private final RestaurantService service;
    Formule mezzogiorno = new Formule("Mezzogiorno", List.of(
            new Plat("Bruschetta Di Pomodora con Parma", 6.90, List.of()),
            new Plat("Risotto al Sapore di Mare",14.80, List.of())
    ));
    Formule pizza = new Formule("Pizza", List.of());

    List<Formule> carte = List.of(mezzogiorno, pizza);

    public FormuleController(RestaurantService service){ this.service = service; }

}

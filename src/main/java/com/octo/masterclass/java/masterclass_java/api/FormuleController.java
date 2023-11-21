package com.octo.masterclass.java.masterclass_java.api;

import com.octo.masterclass.java.masterclass_java.persistence.Formule;
import com.octo.masterclass.java.masterclass_java.rerpository.FormuleRepository;
import com.octo.masterclass.java.masterclass_java.restaurant.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/formules")
public class FormuleController {

    FormuleRepository formuleRepository;

    public FormuleController(FormuleRepository formuleRepository) {
        this.formuleRepository = formuleRepository;
    }

    public Iterable<Formule> listeDesFormules() {
        return formuleRepository.findAll();
    }


    //final RestaurantService service;
    //public FormuleController(RestaurantService service){this.service = service; }
    //@GetMapping
    /* List<Formule> getFormules(){
        return formules;
    }*/

    //@GetMapping("/prix")
    /* Double getPrixFormuleMidi() {
        return service.calculerPrixFormule(midi);
    }*/
}


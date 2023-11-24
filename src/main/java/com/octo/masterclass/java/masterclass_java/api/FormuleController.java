package com.octo.masterclass.java.masterclass_java.api;

import com.octo.masterclass.java.masterclass_java.persistence.Formule;
import com.octo.masterclass.java.masterclass_java.rerpository.FormuleRepository;
import com.octo.masterclass.java.masterclass_java.restaurant.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/formules")
public class FormuleController {

    FormuleRepository formuleRepository;
    final RestaurantService service;

    public FormuleController(FormuleRepository formuleRepository, RestaurantService service) {
        this.formuleRepository = formuleRepository;
        this.service = service;
    }

    public Iterable<Formule> listeDesFormules() {
        return formuleRepository.findAll();
    }

   /* @GetMapping("/prix")
    Double getPrixFormuleMidi() {
        Formule maFormuleMidi = Arrays.asList(listeDesFormules()).contains();
        return service.calculerPrixFormule();
    }*/
}


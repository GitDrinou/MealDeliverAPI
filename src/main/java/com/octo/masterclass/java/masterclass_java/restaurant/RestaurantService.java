package com.octo.masterclass.java.masterclass_java.restaurant;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    public Double calculerPrixFormule(Formule formule) {
        return formule.composition.stream()
                .map(Plat::getPrix)
                .reduce(Double::sum)
                .orElse(0.0);
    }

    public Formule creerMenu(List<Plat> plats, String nom) {
        return new Formule();
    }
}

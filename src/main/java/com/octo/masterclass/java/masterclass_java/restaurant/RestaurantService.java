package com.octo.masterclass.java.masterclass_java.restaurant;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    public Double calculerPrixFormule(Formule formule) {
        return formule.composition.stream()
                .map(Plat::getPrix)
                .reduce(Double::sum)
                .orElse(0.0);
    }

    /*public Panier creerMenu(List<Plat> plats){
        return new Panier();
    }*/
}

package com.octo.masterclass.java.masterclass_java.restaurant;

import com.octo.masterclass.java.masterclass_java.persistence.Formule;
import com.octo.masterclass.java.masterclass_java.persistence.Plat;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    public Double calculerPrixFormule(Formule formule) {
        return formule.plats.stream()
                .map(Plat::getPrix)
                .reduce(Double::sum)
                .orElse(0.0);
    }
}

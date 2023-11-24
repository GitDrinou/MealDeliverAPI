package com.octo.masterclass.java.masterclass_java.persistence;

import jakarta.persistence.Entity;
import java.util.List;

@Entity
public class Entree extends Plat {
    Boolean isAColdStarter;

    public Entree(String nom, Double prix, Integer tempsPreparation, List<Ingredient> ingredients, Boolean isAColdStarter) {
        super(nom, prix, tempsPreparation, ingredients);
        this.isAColdStarter = isAColdStarter;
    }

    public Entree() {

    }
}

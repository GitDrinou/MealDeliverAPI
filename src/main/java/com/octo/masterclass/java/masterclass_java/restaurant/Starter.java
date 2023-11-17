package com.octo.masterclass.java.masterclass_java.restaurant;

import java.util.List;

public class Starter extends Plat{
    Boolean isAColdStarter;

    public Starter(String nom, Double prix, List<Ingredient> ingredients, Boolean isAColdStarter) {
        super(nom, prix, ingredients);
        this.isAColdStarter = isAColdStarter;
    }
}

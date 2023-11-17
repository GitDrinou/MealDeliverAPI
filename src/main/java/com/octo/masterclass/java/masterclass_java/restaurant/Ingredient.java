package com.octo.masterclass.java.masterclass_java.restaurant;

public class Ingredient {
    String nom;
    Boolean allergene;
    Integer spicy;

    public Ingredient(String nom, Boolean allergene, Integer spicy) {
        this.nom = nom;
        this.allergene = allergene;
        this.spicy = spicy;
    }

    public String getNom() {
        return nom;
    }

    public Boolean getAllergene() {
        return allergene;
    }

    public Integer getSpicy() {
        return spicy;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAllergene(Boolean allergene) {
        this.allergene = allergene;
    }

    public void setSpicy(Integer spicy) {
        this.spicy = spicy;
    }
}

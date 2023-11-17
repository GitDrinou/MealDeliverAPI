package com.octo.masterclass.java.masterclass_java.restaurant;

import java.util.List;

public class Plat {
    String nom;
    Double prix;

    // Default constructor
    public Plat() {}

    List<Ingredient> ingredients;

    // Constructor with parameters
    public Plat(String nom, Double prix, List<Ingredient> ingredients) {
        this.nom = nom;
        this.prix = prix;
        this.ingredients = ingredients;
    }

    // Getter & Setter
    public String getNom() {
        return nom;
    }

    public Double getPrix() {
        return prix;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}

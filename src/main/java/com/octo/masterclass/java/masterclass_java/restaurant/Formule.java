package com.octo.masterclass.java.masterclass_java.restaurant;

import java.util.List;

public class Formule {
    String nom;
    List<Plat> composition;

    public Formule(String nom, List<Plat> composition) {
        this.nom = nom;
        this.composition = composition;
    }

    public Formule() {

    }

    public String getNom() {
        return nom;
    }

    public List<Plat> getComposition() {
        return composition;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setComposition(List<Plat> composition) {
        this.composition = composition;
    }
}

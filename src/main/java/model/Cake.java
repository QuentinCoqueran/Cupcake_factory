package model;

import java.util.List;

public class Cake {
    private String Nom;
    private float price;
    private List<Topping> toppingList;

    public Cake(String nom, float price, List<Topping> toppingList) {
        this.Nom = nom;
        this.price = price;
        this.toppingList = toppingList;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public float getPrix() {
        return price;
    }

    public void setPrix(float prix) {
        price = prix;
    }

}
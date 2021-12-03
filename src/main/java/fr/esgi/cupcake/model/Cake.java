package fr.esgi.cupcake.model;

import java.util.HashSet;
import java.util.Set;

public class Cake {
    private String Nom;
    private Prix price;
    private Set<Topping> toppingList;

    public Cake(String nom) {
        this.Nom = nom;
        if(nom.equals("Cupcake")){
            this.price = new Prix("Dollar", 1);
        } else if (nom.equals("Cookie")) {
            this.price = new Prix("Dollar", 2);
        }
        this.toppingList = new HashSet<>();
    }

    public String getNom() {
        return Nom;
    }

    public String showRecipe() {
        String result = "un" + this.Nom.toLowerCase();
        if(this.toppingList.size() > 0){
            result += " avec ";
        }
        int count = 0;
        for(Topping topping : this.toppingList){
            if(this.toppingList.size() == 1) {
                result += " du " + topping.getNomTopping();
            }
            else if(count + 1 >= this.toppingList.size()) {
                result += " et du " + topping.getNomTopping();
            } else {
                result += " du " + topping.getNomTopping() + ",";
            }
            count ++;
        }
        return result;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public Prix getPrix() {
        return price;
    }

    public void setPrix(Prix prix) {
        price = prix;
    }

}
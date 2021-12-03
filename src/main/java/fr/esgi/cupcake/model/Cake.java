package fr.esgi.cupcake.model;

import java.util.HashSet;
import java.util.Set;

public class Cake {
    private String nom;
    private Prix price;
    private Set<Topping> toppingList;

    public Cake(String nom) {
        this.nom = nom;
        if(nom.equals("Cupcake")){
            this.price = new Prix("Dollar", 1);
        } else if (nom.equals("Cookie")) {
            this.price = new Prix("Dollar", 2);
        }
        this.toppingList = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public String showRecipe() {
        String result = "un" + this.nom.toLowerCase();
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
        this.nom = nom;
    }

    public Prix getPrix() {
        return price;
    }

    public void setPrix(Prix prix) {
        price = prix;
    }

    public Cake with(Topping topping){
        Cake cake = new Cake(this.nom);
        for (Topping top : this.toppingList){
            cake.toppingList.add(top);
        }
        cake.setPrix(this.price);
        cake.toppingList.add(topping);
        return cake;
    }

    public Prix afficherPrix(){
        for (Topping topping : this.toppingList){
            this.price = this.price.plus(topping.getPrix());
        }
        return this.price;
    }
}
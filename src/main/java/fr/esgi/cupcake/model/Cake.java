package fr.esgi.cupcake.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

public class Cake {

    private String nom;
    private Prix price;
    private Set<Topping> toppingList;
    private LocalDate cookDate;

    public Cake(String nom) {
        this.nom = nom;
        if(nom.equalsIgnoreCase("cupcake")){
            this.price = new Prix("Dollar", 1);
        } else if (nom.equalsIgnoreCase("cookie")) {
            this.price = new Prix("Dollar", 2);
        }
        this.cookDate = LocalDate.now();
        this.toppingList = new HashSet<>();
    }

    private Cake(String nom, Prix price, Set<Topping> toppingList){
        this.nom = nom;
        this.price = price;
        this.toppingList = toppingList;
    }

    public String getNom() {
        return nom;
    }

    public String showRecipe() {
        String result = this.nom;
        if(this.toppingList.size() > 0){
            result += " with ";
        }
        int count = 0;
        for(Topping topping : this.toppingList){
            if(count + 1 >= this.toppingList.size()) {
                result += topping.getNomTopping().toLowerCase();
            } else {
                result += topping.getNomTopping().toLowerCase() + " and ";
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

    public LocalDate getCookDate() {
        return cookDate;
    }

    public void setCookDate(LocalDate cookDate) {
        this.cookDate = cookDate;
    }

    public Cake with(Topping topping){
        Cake cake = new Cake(this.nom, this.price, this.toppingList);
        cake.toppingList.add(topping);
        return cake;
    }

    public Prix showPrice(){
        for (Topping topping : this.toppingList){
            this.price = this.price.plus(topping.getPrix());
        }
        return this.price;
    }

    public Boolean isExpired(){
        return this.cookDate.until(LocalDate.now(), ChronoUnit.DAYS) > 2;
    }
}
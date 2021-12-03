package fr.esgi.cupcake;

import fr.esgi.cupcake.model.Cake;
import fr.esgi.cupcake.model.Prix;
import fr.esgi.cupcake.model.Topping;

import java.util.List;
import java.util.Set;

public class Factory {

    public static Cake createCake(String recipe) {
        List<String> element = List.of(recipe.split(" "));
        Cake cake = new Cake(element.get(0));
        for(String s : element) {
            if(s.equalsIgnoreCase("chocolate")) {
                cake = cake.with(chocolat());
            }
            if(s.equalsIgnoreCase("peanuts")) {
                cake = cake.with(peanuts());
            }
            if(s.equalsIgnoreCase("caramel")) {
                cake = cake.with(caramel());
            }
        }
        return cake;
    }

    public static Topping chocolat(){
        return new Topping("Chocolate", new Prix("Dollar", (double) 0.1));
    }

    public static Topping peanuts(){
        return new Topping("Peanuts", new Prix("Dollar", (double) 0.2));
    }

    public static Topping caramel(){
        return new Topping("Caramel", new Prix("Dollar", (double) 0.3));
    }
}

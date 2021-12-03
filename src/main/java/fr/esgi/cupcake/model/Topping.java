package fr.esgi.cupcake.model;

import java.util.Objects;

public class Topping {
    private String nomTopping;
    private Prix prix;

    public Topping(String nomTopping, Prix prix) {
        this.nomTopping = nomTopping;
        this.prix = prix;
    }

    public String getNomTopping() {
        return nomTopping;
    }

    public void setNomTopping(String nomTopping) {
        this.nomTopping = nomTopping;
    }

    public Prix getPrix() {
        return prix;
    }

    public void setPrix(Prix prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topping topping = (Topping) o;
        return Objects.equals(nomTopping, topping.nomTopping) && Objects.equals(prix, topping.prix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomTopping, prix);
    }
}

package fr.esgi.cupcake.model;

import fr.esgi.cupcake.model.Cake;

import java.util.List;

public class Bundle {
    private List<Cake> cakes;
    private Prix prix;

    public Bundle(List<Cake> cakes) {
        this.cakes = cakes;
        this.prix = new Prix("Dollar",  0.0);
        for(Cake cake : cakes) {
            this.prix = this.prix.plus(cake.showPrice());
        }
        this.prix.setMontant(this.prix.getMontant()*0.90);
    }

    public List<Cake> getCakes() {
        return cakes;
    }

    public void setCakes(List<Cake> cakes) {
        this.cakes = cakes;
    }

    public Prix getPrix() {
        return prix;
    }

    public void setPrix(Prix prix) {
        this.prix = prix;
    }
}

package fr.esgi.cupcake.model;

import java.util.Objects;

public class Prix {
    private String nDevise;
    private int montant;

    public Prix(String nDevise, int montant) {
        this.nDevise = nDevise;
        this.montant = montant;
    }

    public Prix plus(Prix prix){
        if(prix.nDevise.equals(this.nDevise)){
            return new Prix(this.nDevise, prix.montant + this.montant);
        } else {
            throw new IllegalArgumentException("Devise différentes");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prix prix = (Prix) o;
        return montant == prix.montant && Objects.equals(nDevise, prix.nDevise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nDevise, montant);
    }

    public String getnDevise() {
        return nDevise;
    }

    public void setnDevise(String nDevise) {
        this.nDevise = nDevise;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}

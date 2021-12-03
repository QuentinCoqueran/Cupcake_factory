package fr.esgi.cupcake.model;

import java.util.Objects;

public class Prix {
    private String nDevise;
    private double montant;

    public Prix(String nDevise, double montant) {
        this.nDevise = nDevise;
        this.montant = montant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prix prix = (Prix) o;
        return Double.compare(prix.montant, montant) == 0 && nDevise.equals(prix.nDevise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nDevise, montant);
    }

    public Prix plus(Prix prix){
        if(prix.nDevise.equals(this.nDevise)){
            return new Prix(this.nDevise,  (double) (prix.montant + this.montant));
        } else {
            throw new IllegalArgumentException("Devise différentes");
        }
    }

    public String getnDevise() {
        return nDevise;
    }

    public void setnDevise(String nDevise) {
        this.nDevise = nDevise;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}

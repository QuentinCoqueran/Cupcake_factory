package model;

public class Prix {
    private String nDevise;
    private int montant;

    public Prix(String nDevise, int montant) {
        this.nDevise = nDevise;
        this.montant = montant;
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

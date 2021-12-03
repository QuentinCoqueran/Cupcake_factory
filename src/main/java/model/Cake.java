package model;

public class Cake {
    private String Nom;
    private float Prix;


    public Cake(String nom, float prix) {
        Nom = nom;
        Prix = prix;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public float getPrix() {
        return Prix;
    }

    public void setPrix(float prix) {
        Prix = prix;
    }

}
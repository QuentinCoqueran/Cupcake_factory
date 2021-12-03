package model;

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


}

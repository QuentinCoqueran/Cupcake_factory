package fr.esgi.cupcake.model;

import fr.esgi.cupcake.model.Cake;
import java.util.Set;

public class Bundle {
    Set<Cake> cakes;

    public Bundle(Set<Cake> cakes) {
        this.cakes = cakes;
    }

    public Set<Cake> getCakes() {
        return cakes;
    }

    public void setCakes(Set<Cake> cakes) {
        this.cakes = cakes;
    }
}

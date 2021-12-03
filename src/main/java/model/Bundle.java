package model;

import java.util.List;
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

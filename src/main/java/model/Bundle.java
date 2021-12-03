package model;

import java.util.List;

public class Bundle {

    List<Cake> listOfCake;

    public List<Cake> getListOfCake() {
        return listOfCake;
    }

    public void setListOfCake(List<Cake> listOfCake) {
        this.listOfCake = listOfCake;
    }

    public Bundle(List<Cake> listOfCake) {
        this.listOfCake = listOfCake;
    }
}

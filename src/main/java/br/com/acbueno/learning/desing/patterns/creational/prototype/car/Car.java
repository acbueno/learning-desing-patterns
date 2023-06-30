package br.com.acbueno.learning.desing.patterns.creational.prototype.car;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable {

    private List<String> listCar;

    public Car() {
        listCar = new ArrayList<>();
    }

    public Car(List<String> list) {
        this.listCar = list;
    }

    public void loadData() {
        listCar.add("Versa");
        listCar.add("Astra");
        listCar.add("Focus");
        listCar.add("Sentra");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String item : listCar) {
            temp.add(item);
        }
        return new Car(temp);
    }

    public List<String> getListCar() {
        return listCar;
    }

}

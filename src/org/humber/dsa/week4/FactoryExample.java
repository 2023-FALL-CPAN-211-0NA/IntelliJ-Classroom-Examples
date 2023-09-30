package org.humber.dsa.week4;

class Fruit {

    private String name;

    private Fruit(String name) {
        this.name = name;
    }

    public static Fruit createFruit(String name) {
        if(name != null || !name.isEmpty()) {
            return new Fruit(name);
        }
        return null;
    }
}

public class FactoryExample {

    public static void main(String[] args) {
        Fruit fruit = Fruit.createFruit("Apple");
    }


}

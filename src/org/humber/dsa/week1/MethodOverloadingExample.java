package org.humber.dsa.week1;

/**
 * METHOD OVERLOADING EXAMPLE
 * */
class Addition {

    private final int base;

    public Addition(int base) {
        this.base = base;
    }

    public Addition() {
        this.base = 0;
    }

    public int add(int number1, int number2) {
        return base + number1 + number2;
    }

    public int add(int number1, int number2, int number3) {
        return base + number1 + number2 + number3;
    }

    public double add(double number1, double number2) {
        return base + number1 + number2;
    }

}

public class MethodOverloadingExample {

    public static void main(String[] args) {
        System.out.println("Addition With Base: ");
        Addition addition = new Addition(5);
        System.out.println(addition.add(1,2));
        System.out.println(addition.add(1,2,3));
        System.out.println(addition.add(4D, 5D));

        System.out.println();
        System.out.println("Addition Without Base: ");
        addition = new Addition();
        System.out.println(addition.add(1,2));
        System.out.println(addition.add(1,2,3));
        System.out.println(addition.add(4D, 5D));
    }
}

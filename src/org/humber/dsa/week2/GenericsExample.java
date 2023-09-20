package org.humber.dsa.week2;

import java.util.ArrayList;
import java.util.List;


public class GenericsExample {

    public static void main(String[] args) {

        List<Bank> banks = new ArrayList<>();
        banks.add(new RBC());
        banks.add(new CIBC());
        banks.add(new TD());
        printList(banks);
        for (Bank each : banks) {
            System.out.println(each.getName());
        }
        System.out.println("------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        printList(numbers);
        for (Integer each : numbers) {
            System.out.println(each);
        }
    }

    //Generic Methods
    public static <T> void printList(List<T> list) {
        for (T each : list) {
            System.out.println(each);
        }
    }

}

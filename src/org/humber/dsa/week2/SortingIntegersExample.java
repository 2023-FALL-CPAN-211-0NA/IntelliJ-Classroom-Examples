package org.humber.dsa.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingIntegersExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(111);
        numbers.add(10);
        numbers.add(23);
        System.out.println("List Before Sorting");
        printNumbers(numbers);

        Collections.sort(numbers);
        System.out.println("List After Sorting");
        printNumbers(numbers);
    }

    private static void printNumbers(List<Integer> numbers) {
        for (Integer each : numbers) {
            System.out.println(each);
        }
        System.out.println();
    }
}

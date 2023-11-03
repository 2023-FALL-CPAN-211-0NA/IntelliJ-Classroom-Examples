package org.humber.dsa.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.addAll(Arrays.asList(2,3));

        System.out.println(numbers);

        numbers.remove(Integer.valueOf(1));

        System.out.println(numbers);

    }

}

package org.humber.dsa.week3.java8streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer num) {
        return num % 2 == 0;
    }
}

public class Example1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> evenNumbers = filterEvenNumbers(numbers);

        System.out.println(evenNumbers);
/*
        numbers.forEach(each -> {
            if (each % 2 == 0) {
                String str = "Number is " + each;
                System.out.println(str);
            }
        });
*/
/*

        numbers.stream()
                .filter(each -> each % 2 == 0)
                .map(Example1::convertToString)
                .forEach(System.out::println);
*/
    }

    private static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(each -> each % 2 == 0)
                .filter(new EvenNumberPredicate())
                .collect(Collectors.toList());
    }



    private static String convertToString(Integer number) {
        return "Number is" + number;
    }

}



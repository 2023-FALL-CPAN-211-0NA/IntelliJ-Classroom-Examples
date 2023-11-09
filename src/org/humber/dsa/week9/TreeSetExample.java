package org.humber.dsa.week9;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(100);
        set.add(1);
        set.add(3);
        System.out.println(set.add(4));

        System.out.println(set);
        System.out.println();

        System.out.println(set.add(1));

        System.out.println(set);
        System.out.println();

        set.remove(1);
        set.remove(4);
        System.out.println("Removing 100: " + set.remove(100));

        System.out.println(set);
        System.out.println();
    }


}

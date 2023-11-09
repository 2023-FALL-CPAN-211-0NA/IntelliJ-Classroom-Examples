package org.humber.dsa.week9;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableExample {

    public static void main(String[] args) {

        Map<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(5, "Five");
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.get(2));
        System.out.println(hashtable.get(3));
        //NA
        System.out.println(hashtable.get(4));

        Set<Map.Entry<Integer, String>> set = hashtable.entrySet();

        Set<Integer> keys = hashtable.keySet();
        System.out.println(keys);

        System.out.println(hashtable.values());

        System.out.println(set);
        //Exception will be thrown
        hashtable.put(null, "Random");
    }

}

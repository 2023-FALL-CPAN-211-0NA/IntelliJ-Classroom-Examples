package org.humber.dsa.week9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, String> openingParenthesisOf = new HashMap<>();

        openingParenthesisOf.put("}", "{");
        openingParenthesisOf.put(")", "(");
        openingParenthesisOf.put("]", "[");
        openingParenthesisOf.put(null, "Random");

        System.out.println(openingParenthesisOf.get("}"));
        System.out.println(openingParenthesisOf.get(")"));
        System.out.println(openingParenthesisOf.get("]"));
        //NA
        System.out.println(openingParenthesisOf.get("["));

        Set<Map.Entry<String, String>> set = openingParenthesisOf.entrySet();

        Set<String> keys = openingParenthesisOf.keySet();
        System.out.println(keys);

        System.out.println(openingParenthesisOf.values());

        System.out.println(set);
    }

}

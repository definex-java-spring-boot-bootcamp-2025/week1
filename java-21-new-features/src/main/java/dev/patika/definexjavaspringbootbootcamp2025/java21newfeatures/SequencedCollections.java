package dev.patika.definexjavaspringbootbootcamp2025.java21newfeatures;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SequencedCollections {
    public static void main(String[] args) {
        // Using new SequencedCollection methods
        System.out.printf("------ List ------%n");
        List<String> list = new ArrayList<>(List.of("first", "middle", "last"));
        String first = list.getFirst();
        System.out.printf("First: %s%n", first);
        String last = list.getLast();
        System.out.printf("Last: %s%n", last);
        List<String> reversed = list.reversed();
        System.out.printf("------ After Reverse ------%n");
        System.out.printf("First: %s%n", reversed.getFirst());
        System.out.printf("Last: %s%n", reversed.getLast());
        System.out.printf("%n");
        System.out.printf("------ HashMap ------%n");
        // Using SequencedMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.putFirst(1, "one");
        map.putLast(2, "two");
        Map.Entry<Integer, String> firstEntry = map.firstEntry();
        System.out.printf("firstEntry: %s%n", firstEntry);
        Map.Entry<Integer, String> lastEntry = map.lastEntry();
        System.out.printf("lastEntry: %s%n", lastEntry);

    }
}

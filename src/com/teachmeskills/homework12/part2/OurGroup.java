package com.teachmeskills.homework12.part2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class OurGroup {
    public static void main(String[] args) {
        Set<String> group = new LinkedHashSet<>();

        group.add("Vladislav");
        group.add("Alexey");
        group.add("Kipan");
        group.add("Dovlet");
        group.add("Tatyana");
        group.add("Roman");
        group.add("Andrew");// The best teacher
        group.add("Andrew");
        group.add("Hleb");

        System.out.println(group);
    }
}

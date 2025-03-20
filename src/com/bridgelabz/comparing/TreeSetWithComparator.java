package com.bridgelabz.comparing;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparator {
    public static void main(String[] args) {


        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        TreeSet<String> set = new TreeSet<>(lengthComparator);
        set.add("banana");
        set.add("apple");
        set.add("grapes");
        set.add("strawberry");
        set.add("abc");
        System.out.println(set);
    }
}

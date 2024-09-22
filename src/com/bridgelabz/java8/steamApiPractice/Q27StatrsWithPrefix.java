package com.bridgelabz.java8.steamApiPractice;

import java.util.Arrays;
import java.util.List;

public class Q27StatrsWithPrefix {

    public static void main(String[] args){


        List<String> stringList = Arrays.asList("ABCD", "Prashanth");
        String prefix = "Prash";

        boolean isStatrted = stringList.stream().anyMatch(s -> s.startsWith(prefix));

    }
}

package com.bridgelabz.java8.steamApiPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q19CollectUniqueWordsFromSentances {

    public static void main(String []args) {

        List<String>  sentances = Arrays.asList(
          "Java 8 is powerfull",
          "Java is good",
          "Advanced technology"
        );

        Set<String> uniqueWords = sentances.stream()
                .map(sentance -> sentance.split("\\s+"))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        uniqueWords.stream().forEach(System.out::println);


    }
}

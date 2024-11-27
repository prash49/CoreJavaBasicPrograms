package com.bridgelabz.DSA.StringProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverWordsInSentance {

    public static void main(String[] args){
    String inputString = "..My..Name.is.Prashanth";
    // output should be Prashanth.is.Name.My .. should be eliminated

        System.out.println(reverWordsInSentance(inputString));
    }

    static String reverWordsInSentance(String inputString){
        /*
        * Strategy to solve this is to 1.split the worlds by . or .. then Add them into array and Join then into new String by reverse order by adding . in the middle for words
        * except first and last index
        * */

        List<String> words = new ArrayList<String>();
        String[] parts  = inputString.split("\\.");
        System.out.println(parts.length);

        for(String word : parts){
            System.out.println(word);
            if(!word.isEmpty()){
                words.add(word);
            }
        }
        System.out.println(words);
        Collections.reverse(words);
        return String.join(".", words);
    }


}

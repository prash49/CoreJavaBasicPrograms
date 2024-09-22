package com.bridgelabz.javaCodingPractice;

import netscape.javascript.JSObject;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WordCountFromString {

    WordCountFromString(){
        System.out.println("Hello from constrcutor");
    }

    public static void main(String[] args){

        String inputString = "My name is Prashanth Prashanth";

        Map<String,Integer> resultMap = new WeakHashMap<String,Integer>();
        for (String  str :  inputString.split(" ")){
            if(!resultMap.isEmpty() && resultMap.containsKey(str)){
                resultMap.replace(str, resultMap.get(str) + 1);
            }else {
                resultMap.put(str, 1);
            }
            System.out.println("result:"+resultMap.toString());
        }
    }
}

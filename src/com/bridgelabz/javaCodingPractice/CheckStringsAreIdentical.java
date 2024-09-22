package com.bridgelabz.javaCodingPractice;

public class CheckStringsAreIdentical {

    public static void main(String[] args){
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";

        boolean stringsAreIdentitical = areStringsAreIdentitical(str1,str2);
        if(stringsAreIdentitical){
            System.out.print("string are identitical");
        } else {
            System.out.print("string are not identitical");

        }
    }

    public static boolean areStringsAreIdentitical(String str1, String str2){

        // if length of strings are not identitical
        if(str1.length() != str2.length()){
            return false;
        }
        for (int i = 0 ; i< str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

package com.bridgelabz.javaCodingPractice;

import java.util.Arrays;

public class StringCharCount {

    public static void main(String[] args) {

        String input = " I love my india. ";

        // count number of chars

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') || (input.charAt(i) >= 'A' && input.charAt(i) >= 'Z')) {
                count++;
            }
        }

        System.out.println(count);

       /* String stringBuilder = "";

      String[]  arrayString = input.split(" ");
      for(int i = 0; i < arrayString.length ; i++){
          if((arrayString[i]).length() > 0) {
              char[] chars = arrayString[i].toCharArray();
              if (chars[0] >= 'a' || chars[0] <= 'z') {
                  chars[0] = (char) (chars[0] - 32);
                 stringBuilder = stringBuilder+chars.toString();
              } else {
                  stringBuilder = stringBuilder+chars.toString();
              }
          }
      }

        System.out.println(stringBuilder);
    }*/
    }
}

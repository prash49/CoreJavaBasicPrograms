package com.bridgelabz;

import java.util.Scanner;

public class VowelsOrConsonants {
    public static void main(String[] args) {
        //variables
        char character;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a Character to Check it is a Vowel or Consonant");
        character = scanner.next().charAt(0);
        //checking whether input data is char or not
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            switch (character) {
                case 'a' + 'e' + 'i' + 'o' + 'u' + 'A' + 'E' + 'I' + 'O' + 'U':
                    System.out.print(character + " is vowel");
                    break;
                default:
                    System.out.println(character + " is consonant");
            }
        } else System.out.println("enter a character");
    }
}

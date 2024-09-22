package com.bridgelabz;

import java.util.Scanner;

public class CharacterExamples {

    public static void main(String[] args){
        //TODO write a program to convert
        /*to covert a Upper case char to lower add +32 and convert that to char
        * to convert a lower case char to upper case -32*/

        Scanner scanner = new Scanner(System.in);
        char character = 'a';
        if(character >= 'a' && character <= 'z'){
            System.out.println("character +"+ character + "converted :"+ (char) (character - 32));
        }else if(character >= 'A' && character <= 'Z'){
            System.out.println("character +"+ character + "converted :"+ (char) (character + 32));
        }
    }
}

package com.bridgelabz.DSA.StringProblems;

public class CheckRotatedString {


    public static void main(String[] args) {
        /*TODO here solving String related DSA problems*/

        /*TODO Q1: Check if a string can be obtained by rotating another string 2 places*/
        /*Given two strings, str1 and str2, the task is to determine if str2 can be obtained by rotating str1 exactly 2 places in either a clockwise or anticlockwise direction.*/
        String str1 = "amazon";
        String str2 = "azonam";
        CheckRotatedString stringProblems = new CheckRotatedString();
        System.out.println(" is String rotated : " + stringProblems.isRotated(str1, str2));

    }


    public Boolean isRotated(String str1, String str2) {
        // check if the input String are equal in size if not return false directly
        if (str1.length() != str2.length()) {
            return false;
        }
        // check if given string of length 2 if true then check equality for both and return true
        if (str1.length() < 2) {
            return str2.equals(str1);
        }
        // we need to store
        /* so to findout str1 is can be obtaine we need clockwise rotation of Str1 by 2 places by using subString*/
        String clockRotation = "";
        String antiClockRotation = "";
        int n = str2.length();

        // to obtain antiClock rotation Str2 to compare with Str1 we need to concatinate last  2 digits of str2 to beging
        System.out.println(str2.substring(n - 2));
        System.out.println(str2.substring(0, n-2));


        // compare to check whether the string rotated anticlock or not
        antiClockRotation = str2.substring(n-2) + str2.substring(0, n-2);
        System.out.println(antiClockRotation);
        clockRotation = str2.substring(2,n) + str2.substring(0,2);
        System.out.println(clockRotation);

        if(str1.equals(antiClockRotation) || str1.contentEquals(clockRotation)){
            return true;
        }


        return false;
    }

}

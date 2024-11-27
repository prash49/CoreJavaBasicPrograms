package com.bridgelabz.DSA.StringProblems;

import java.util.Arrays;

public class LongestCommonPrefix {
    /*TODO Given an array of strings strs[]. The task is to return the longest common prefix among each
        and every strings present in the array. If there’s no prefix common in all the strings, return “-1”.*/

    /*
    * Input: strs[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
Output: gee
Explanation: “gee” is the longest common prefix in all the given strings.


Input: strs[] = [“hello”, “world”]
Output: -1
Explanation: There’s no common prefix in the given strings.
    * */

    public static void main(String[] args) {
        // how to define a Array
        String[] array = {"GeeksForGeeks", "Geek", "Geezer"};
        String[] array2 = new String[]{"Hello", "World"};
        System.out.println(longestCommonPrefix(array));
        System.out.println(longestCommonPrefix(array2));

    }

    static String longestCommonPrefix(String[] stringArray) {
        if (stringArray == null || stringArray.length == 0) {
            return "-1";
        }
        //Sort the array
        Arrays.sort(stringArray);

        // get the first and last String after sorting
        String first = stringArray[0];
        String last = stringArray[stringArray.length - 1];
        // take the min length for iteration to avoid the ArrayOutOfIndex
        int minLength = Math.min(first.length(), last.length());
        // above method just check with String is of Least length

        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        // from above while loop we will check the i shoul be min length and checks matching words eachtime
        if (i == 0) {
            return "-1";
        }
        //if first letter itself is wrong it'll return zero
        // then based on i take out the subString from firstElement in array
        System.out.println(i);
        return first.substring(0, i);
    }
}

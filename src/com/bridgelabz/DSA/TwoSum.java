package com.bridgelabz.DSA;

import java.util.HashMap;

public class TwoSum {
    /*TODO Given array of Integers return indicies of Array whose sum is equal to Target Value
     *
     * ex: [1,2,3,4,5] target value 4 i can 0 and 2nd index sum is equals 4 hence need to return [0,2] index*/

    //using hasing

    public static void main(String[] args) {
        int[] intarray = new int[]{1, 8, 9, 4};
        int targetvalue = 5;
        int[] indcies = new int[2];
        indcies = findIndices(intarray, targetvalue);
        if (indcies[1] == 0) {
            System.out.println("not value for matching the target value");
        } else {
            System.out.println("indicies are " + indcies[0] + "   " + indcies[1]);
        }
    }

    static int[] findIndices(int[] intarray, int targetvalue) {
        if (intarray.length == 0) {
            return new int[]{0, 0};
        }
        HashMap map = new HashMap();
        for (int i = 0; i < intarray.length; i++) {
            map.put(intarray[i], i);
        }
        int i = 0;
        int initialvalue = intarray[i];
        for (int j = i + 1; j < intarray.length - 1; j++) {
            int searchValue = targetvalue - initialvalue;
            if (map.containsKey(searchValue)) {
                return new int[]{i, (int) map.get(searchValue)};
            }
            i++;
        }
        return new int[]{0, 0};
    }
}

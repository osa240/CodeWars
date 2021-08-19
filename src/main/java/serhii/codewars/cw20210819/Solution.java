package serhii.codewars.cw20210819;

import java.util.Arrays;

public class Solution {
    public static long maxNumber(long n) {
        Long tempN = n;
        char[] array = tempN.toString().toCharArray();
        Arrays.sort(array);

        return Long.parseLong(array.toString()); // Do your magic!
    }
}

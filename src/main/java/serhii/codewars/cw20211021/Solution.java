package serhii.codewars.cw20211021;

import java.util.Arrays;

public class Solution {
    public static boolean tidyNumber(int number) {
        char[] chars = String.valueOf(number).toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] > chars[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(tidyNumber(12));
        System.out.println(tidyNumber(32));
        System.out.println(tidyNumber(1024));
    }
}
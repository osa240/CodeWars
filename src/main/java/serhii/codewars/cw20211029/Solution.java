package serhii.codewars.cw20211029;

class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    public static void main(String[] args) {
        System.out.println(new Solution().defangIPaddr("255.100.50.0"));
    }
}

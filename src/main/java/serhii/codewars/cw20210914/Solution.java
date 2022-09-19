package serhii.codewars.cw20210914;

class Solution{
    public static String removeDuplicateWords(String s){
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.split(" ");
        stringBuilder.append(words[0]);
        boolean isExistWord;
        for (int i = 1; i < words.length; i++) {
            isExistWord = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    isExistWord = true;
                    break;
                }
            }
            if (!isExistWord) {
                stringBuilder.append(" ").append(words[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static int add(int x, int y) {
        if (y == 0) {
            return x;
        }
        int sum = x ^ y;
        int carry = (x & y) << 1;
        return add(sum, carry);
    }
}
package serhii.codewars.cw20210819;

public class Kata {
  public static int[] multiples(int m, int n) {
    // Code here!
    if (n == 0) {
      return new int[0];
    }
    int[] outArray = new int[m];
    for (int i = 0; i < m; i++) {
      outArray[i] = (i+1) * n;
    }
    return outArray;
  }
}
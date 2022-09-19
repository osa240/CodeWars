package serhii.codewars.cw20211029;

public class Max {
  public static int sequence(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int sum =0;
    int countPositive = 0;
    int countNegative = 0;
    for (int number : arr) {
      if (number >= 0) {
        countPositive++;
        sum += number;
      } else {
        countNegative++;
      }
    }
    if (countPositive == arr.length) {
      return sum;
    } else if (countNegative == arr.length) {
      return 0;
    }
    sum = 0;
    for (int i = 0; i < arr.length; i++) {
      int tmpSum = 0;
      for (int j = i; j < arr.length; j++) {
        tmpSum += arr[j];
        if (tmpSum > sum) {
          sum = tmpSum;
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }
}

package serhii.codewars.cw20211022;

public class Validate{
//  public static boolean validate(String n) {
//    char[] digits = n.toCharArray();
//    int sum = 0;
//    if (digits.length % 2 == 0) {
//      for (int i = 0; i < digits.length; i++) {
//        if (i % 2 == 0) {
//          sum += aloneDigit((digits[i] - 48) * 2);
//        } else {
//          sum += (digits[i] - 48);
//        }
//      }
//    } else {
//      for (int i = 0; i < digits.length; i++) {
//        if (i % 2 == 1) {
//          sum += aloneDigit((digits[i] - 48) * 2);
//        } else {
//          sum += (digits[i] - 48);
//        }
//      }
//    }
//    return sum % 10 == 0;
//  }
//
//  private static int aloneDigit(int number) {
//    while (number > 9) {
//      number -= 9;
//    }
//    return number;
//  }

  public static boolean validate(String n) {
    char[] digits = n.toCharArray();
    int sum = 0;
    int index = 1;
    for (int i = digits.length - 1; i >= 0; i--) {
      if (index % 2 == 0) {
        sum += (digits[i] - '0') * 2 > 9
                ? (digits[i] - '0') * 2 - 9
                : (digits[i] - '0') * 2;
      } else {
        sum += (digits[i] - '0');
      }
      index++;
    }
    return sum % 10 == 0;
  }
  public static void main(String[] args) {
    System.out.println(validate("891"));
    System.out.println(validate("1714"));
  }
}
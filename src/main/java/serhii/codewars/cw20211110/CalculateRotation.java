package serhii.codewars.cw20211110;

public class CalculateRotation {
  static int shiftedDiff(String first, String second){
    int count = 0;
    int length = first.length();
    while (count != length) {
      first = first.charAt(length - 1) + first.substring(0, length - 1);
      count++;
      if (first.equals(second)) {
        return count;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(CalculateRotation.shiftedDiff("hoop", "pooh"));
    System.out.println(CalculateRotation.shiftedDiff("coffee","eecoff"));
    System.out.println(CalculateRotation.shiftedDiff("eecoff","coffee"));
  }
}

package main.waw.goorm.소수판별;

public class Solution {

  public static void main(String[] args) {
    int input = 7;
    boolean result = solution(input);
    System.out.print(result);
  }

  public static boolean solution(int input) {
    boolean result = true;
    for (int i = 2; i < input - 1; i++) {
      if (input % i == 0)
        result = false;
    }

    return result;
  }
}

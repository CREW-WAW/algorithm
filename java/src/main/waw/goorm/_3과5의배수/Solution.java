package main.waw.goorm._3과5의배수;

public class Solution {

  public static void main(String[] args) {
    int input = 30;
    int result = solution(input);
    System.out.println("RESULT :: " + result);
  }

  public static int solution(int input) {
    int result = 0;

    for (int i = 0; i <= input; i++)
      if (i % 3 == 0 || i % 5 == 0)
        result += i;

    return result;
  }
}

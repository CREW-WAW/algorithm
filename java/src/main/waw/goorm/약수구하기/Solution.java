package main.waw.goorm.약수구하기;

public class Solution {

  public static void main(String[] args) {
    int input = 7;
    String result = solution(input);
    System.out.print(result);
  }

	public static String solution(int input) {
    String result = "";
    for (int i = 1; i <= (input / 2); i++) 
			result = (input % i == 0 ? result.concat(" ").concat(String.valueOf(i)) : result);

    return result.concat(" ").concat(String.valueOf(input).concat(""));
  }
}

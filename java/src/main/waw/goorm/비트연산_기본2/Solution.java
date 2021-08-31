package main.waw.goorm.비트연산_기본2;

import java.util.*;

public class Solution {

  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputLeft = in.nextInt();
		int inputRight = in.nextInt();

		System.out.println(inputLeft >> inputRight);
		System.out.println(inputLeft << inputRight);
	}
}

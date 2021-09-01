package main.waw.programmers.kakao_로또순위;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

  public static void main(String[] args) {
    int[] result;
    int[] lottos_param = { 44, 1, 0, 0, 31, 25 };
    int[] win_nums_param = { 31, 10, 45, 1, 6, 19 };

    result = solution(lottos_param, win_nums_param);
    for (int i : result)  System.out.println(i); 
  }

  public static int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = new int[2];
    Map<Integer, Integer> lottoMatch = new LinkedHashMap<>() {
      {
        put(6, 1);
        put(5, 2);
        put(4, 3);
        put(3, 4);
        put(2, 5);
        put(1, 6);
        put(0, 6);
      }
    };

    int minValue = 0, maxValue = 0;
    for (int lotto : lottos) {
      if (Arrays.stream(win_nums).anyMatch(i -> i == lotto))
        minValue++;
      if (lotto == 0) 
        maxValue++; 
    }

    answer[0] = lottoMatch.get(minValue + maxValue);
    answer[1] = lottoMatch.get(minValue);

    return answer;
  }
}

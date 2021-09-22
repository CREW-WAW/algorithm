package main.waw.programmers.완주하지못한선수;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    String result;

    String[] participant = { "kiki", "eden", "leo" };
    String[] completion = { "eden", "kiki" };

    result = solution(participant, completion);
  }

  public static String solution(String[] participant, String[] completion) {
    int i;
    Arrays.sort(participant);
    Arrays.sort(completion);

    for (i = 0; i < completion.length; i++) 
      if (!participant[i].equals(completion[i])) 
        return participant[i];
    return participant[i];
  }
}

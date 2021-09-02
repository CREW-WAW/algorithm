package main.waw.programmers.kakao_신규아이디추천;

public class Solution {

  public static void main(String[] args) {
    String result;
    String new_id_param = "z-+.^.";

    result = solution(new_id_param);
    System.out.println(result);
  }

  public static String solution(String new_id) {
    String answer = new_id.toLowerCase()
      .replaceAll("[^-_.a-z0-9]", "")
      .replaceAll("[.]{2,}", ".")
      .replaceAll("^[.]|[.]$", "");

    if (answer.equals(""))
      answer += "a";

    if (answer.length() >= 16) 
      answer = answer.substring(0, 15).replaceAll("^[.]|[.]$", "");

    if (answer.length() <= 2)
      while (answer.length() < 3)
        answer += answer.charAt(answer.length() - 1);

    return answer;
  }
}

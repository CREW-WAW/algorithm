package main.waw.programmers.더_맵게;

import java.util.*;

public class Solution {

  public static void main(String[] args) {
    int[] pScoville = {1, 2, 3, 9, 10, 12};
    int pK = 7;
    int result = solution(pScoville, pK);
    System.out.print("RESULT :: " + result);
  }

  public static int solution(int[] scovilles, int K) {
    int answer = 0;
    PriorityQueue<Integer> heap = new PriorityQueue();
    for(int i = 0; i < scovilles.length; i++)
      heap.add(scovilles[i]);

    while (heap.peek() < K) {
      if(heap.size() < 2)
        return -1;

      int newScoville = heap.poll() + (heap.poll() * 2);
      heap.add(newScoville);
      answer++;
    }

    return answer;
  }

  public static int solution2(int[] scovilles, int K) {
    int answer = 0;

    Arrays.sort(scovilles);
    int i = 0;
    loop: while (scovilles[i] < K) {
      answer++;
      if ((scovilles.length - 1) <= i)
        return -1;
      scovilles = mixScovilleF(scovilles, scovilles[i] + (scovilles[i + 1] * 2));
      i = 0;
    }

    return answer;
  }

  public static int[] mixScovilleF(int[] oldScovilles, int mixScoville) {
    int[] newScovilles = new int[oldScovilles.length - 1];
    newScovilles[0] = mixScoville;
    for (int i = 1; i < oldScovilles.length - 1; i++)
      newScovilles[i] = oldScovilles[i+1];

    Arrays.sort(newScovilles);
    return newScovilles;
  }
}

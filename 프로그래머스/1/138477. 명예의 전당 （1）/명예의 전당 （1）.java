import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // 1. 상위 k 개만 보관 
        // 2. k개 중 최하위을 결과에 추가
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[score.length];
        
        for(int i=0; i<score.length; i++){
            if(i < k) pq.add(score[i]);
            else if(pq.size() == k) {
                int val = pq.peek(); // k개 중 최소값
                if(val < score[i]){
                    pq.poll();
                    pq.add(score[i]);
                }
            }
            answer[i] = pq.peek();
        }
        return answer;
    }
}
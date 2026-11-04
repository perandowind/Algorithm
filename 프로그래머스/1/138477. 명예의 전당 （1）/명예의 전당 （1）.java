import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            if(i < k) minheap.add(score[i]);
            else if(minheap.size() == k){
                int minVal = minheap.peek();
                if(minVal < score[i]){
                    minheap.poll();
                    minheap.add(score[i]);
                }
            }
            answer[i] = minheap.peek();
        }
        return answer;
    }
}
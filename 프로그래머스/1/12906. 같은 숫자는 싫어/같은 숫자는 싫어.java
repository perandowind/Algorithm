import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i : arr){
            // 스택이 비었거나, 맨 위 숫자와 다른 경우
            if(stack.isEmpty() || stack.peek() != i){
                stack.push(i); // 스택 순서
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(int i=answer.length-1; i>=0; i--){
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}
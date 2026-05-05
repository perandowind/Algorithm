import java.util.*;

class Solution
{
    // 10^6 -> O(n) 정도로 끝내야함, 즉 한번만 스캔해야함 
    // 최신의 상태를 담는 자료구조가 필요
    public int solution(String s)
    {   
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            } else{
                stack.push(c);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}
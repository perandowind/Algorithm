import java.util.*;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int length = absolutes.length;
        int[] copy = Arrays.copyOf(absolutes, length);
        for(int i=0; i<length; i++){
            if(signs[i] == false) copy[i] = -absolutes[i];
        }
        
        int answer = 0;
        for(int i : copy){
            answer += i;
        }
        
        return answer;
    }
}
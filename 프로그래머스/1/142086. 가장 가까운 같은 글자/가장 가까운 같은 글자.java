import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<answer.length; i++){
            int lastIdx = map.getOrDefault(s.charAt(i), -1);
            if(lastIdx == -1){
                answer[i] = -1;
                map.put(s.charAt(i), i);
            }else{
                answer[i] = i - lastIdx;
                map.put(s.charAt(i), i);
            }
        }
        
        return answer;
    }
}
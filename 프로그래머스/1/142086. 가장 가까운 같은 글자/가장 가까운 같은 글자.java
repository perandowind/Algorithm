import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            answer[i] = i - map.getOrDefault(ch, i+1); // 처음 발견하면 배열에는 -1로 저장
            map.put(ch, i); // Map에는 인덱스값 저장
        }
        
        return answer;
    }
}
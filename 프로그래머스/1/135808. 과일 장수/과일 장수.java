import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        // [4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]
        // 4,4,4 | 1,2,2,4,4,1,2,4,2
        // 4,4,4 | 1,2,2,1,2,2
        // 2,2,2 | 1,1,2
        score = Arrays.stream(score)
            .boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
            
        int answer = 0;
        
        for(int i=0; i<score.length - m + 1; i += m){
            answer += score[i + m - 1];
        }
        
        return answer * m;
    }
}
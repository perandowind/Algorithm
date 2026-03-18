import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int left = budget;
        
        Arrays.sort(d);
        
        if(d[0] > budget) return 0;
        
        for(int i=0; i<d.length; i++) {
            if(left >= d[i]){
                answer++;
                left -= d[i];
            }else break;
            
        }
        
        return answer;
    }
}
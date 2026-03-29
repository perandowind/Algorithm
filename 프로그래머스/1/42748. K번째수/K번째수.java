import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // i-1 인덱스부터 < j인덱스 까지 자르고 "정렬"
        
        for(int n=0; n<commands.length; n++){
            int i = commands[n][0], j = commands[n][1], k = commands[n][2];
            int[] tmp = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(tmp);
            int cnt = 0;
            for(int l=0; l<tmp.length; l++){
                cnt++;
                if(cnt == k) answer[n] = tmp[l];   
            }    
        }
        
        return answer;
    }
}
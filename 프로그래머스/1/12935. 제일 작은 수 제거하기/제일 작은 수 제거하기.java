import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        int[] answer = new int[arr.length - 1];
        int[] tmp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(tmp);
        int min = tmp[0];
        int index = 0;
        for(int i : arr){
            if(i != min) {
                answer[index] = i;
                index++;
            }
        }
        
        return answer;
    }
}
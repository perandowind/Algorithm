import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];
        for(int i : arr){
            if(i < min) min = i;
        }
        for(int i : arr){
            if(i == min) continue;
            list.add(i);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}
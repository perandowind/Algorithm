import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // [1, 3, 2, 5, 4, 5, 2, 3] 
        // 1:1, 2:2, 3:2, 4:1, 5:2
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        ArrayList<Integer> counts = new ArrayList<>();
        for(int key : map.keySet()){
            counts.add(map.get(key));
        }
        
        counts.sort(Collections.reverseOrder());
        
        while(k > 0){
            k -= counts.get(0);
            answer++;
            counts.remove(0);
        }
        
        
        return answer;
    }
}
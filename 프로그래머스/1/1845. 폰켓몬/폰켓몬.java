import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int picks = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums){
            set.add(i);
        }
        
        return picks > set.size() ? set.size() : picks;
    }
}
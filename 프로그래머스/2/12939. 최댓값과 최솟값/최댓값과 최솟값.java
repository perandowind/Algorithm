class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        int max = Integer.parseInt(nums[0]), min = Integer.parseInt(nums[0]);
        
        for(String str : nums){
            int val = Integer.parseInt(str);
            if(val > max) max = val;
            if(val < min) min = val;
        }
        
        return min + " " + max;
    }
}
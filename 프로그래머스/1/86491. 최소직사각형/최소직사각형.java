class Solution {
    public int solution(int[][] sizes) {
        // 100,000,000 n^2 가능
        int longest = 0, shortest = 0; 
        for(int i=0; i<sizes.length; i++){
            int longer = Math.max(sizes[i][0], sizes[i][1]);
            int shorter = Math.min(sizes[i][0], sizes[i][1]);
            if(longer > longest) longest = longer;
            if(shorter > shortest) shortest = shorter;
        }
        
        
        
        return longest * shortest;
    }
}
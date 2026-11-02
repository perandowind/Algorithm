class Solution {
    public int solution(int[][] sizes) {
        // 0열 < 1열 이도록 재정렬
        for(int i=0; i<sizes.length; i++){
            int smaller = Math.min(sizes[i][0], sizes[i][1]), 
                bigger = Math.max(sizes[i][0], sizes[i][1]);
            sizes[i][0] = smaller;
            sizes[i][1] = bigger;
        }
        
        int max1 = 0, max2 = 0;
        for(int[] row : sizes){
            if(row[0] > max1) max1 = row[0];
            if(row[1] > max2) max2 = row[1];
        }
        
        
        return max1 * max2;
    }
}
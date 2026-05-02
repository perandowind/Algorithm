class Solution {
    public int solution(int[][] lines) {
        // 겹치는 것을 "칸"단위로 생각. [0, 1] -> 0 번 인덱스 +1, 이후 2 이상인 칸의 개수 count
        // 0~200 인덱스로 offset = +100, [-100, -99] => length[0]++
        int answer = 0;
        
        int[] arr = new int[200];
        int offset = 100;
        
        for(int i=0; i<lines.length; i++){
            int s = lines[i][0] + offset, e = lines[i][1] + offset;
            for(int j=s; j<e; j++){
                arr[j]++;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 2) answer++;
        }
           
        return answer;
    }
}
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastIdx = section[0], paintRange = Math.min(lastIdx + m - 1, n);
        
        for(int i=0; i<section.length; i++){
            if(lastIdx <= section[i] && section[i] <= paintRange){
                continue;
            } else{
                answer++;
                lastIdx = section[i];
                paintRange = Math.min(lastIdx + m - 1, n);
            }
        }
        
        return answer + 1; // 첫 페인트칠 반영
    }
}
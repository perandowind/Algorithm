class Solution {
    public int solution(int[] number) {
        int answer = 0, len = number.length;
        
        for(int i=0; i<len-2; i++){
            for(int j=i+1; j<len; j++){
                for(int n=j+1; n<len; n++){
                    if(number[i] + number[j] + number[n] == 0) answer++;
                }
            }
        }
        
        return answer;
    }
}
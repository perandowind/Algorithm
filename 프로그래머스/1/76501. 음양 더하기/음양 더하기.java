class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int length = absolutes.length;
        for(int i=0; i<length; i++){
            if(signs[i] == false) absolutes[i] = -absolutes[i];
        }
        
        int answer = 0;
        for(int i : absolutes){
            answer += i;
        }
        
        return answer;
    }
}
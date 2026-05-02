class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;
        for(int s=-1000; s<=1000; s++){
            int last = s + num - 1; // 끝값
            
            int sum = (s + last) * num / 2;
            
            if(sum == total){
                start = s;
                break;
            }
        }
        
        for(int i=0; i<num; i++){
            answer[i] = start + i;
        }
        
        return answer;
    }
}
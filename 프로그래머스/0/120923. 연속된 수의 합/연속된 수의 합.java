class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;
        for(int s=-1000; s<=1000; s++){
            int sum = 0;
            for(int i=s; i<s+num; i++){
                sum += i;
            }
            if(sum == total){
                start = s;
                break;
            } 
        }
        
        int index = 0;
        for(int i=start; i<start + num; i++){
            answer[index] = i;
            index++;
        }
        
        
        return answer;
    }
}
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        answer = fun(brown, yellow);
        
        return answer;
    }
    
    int[] fun(int brown, int yellow){
        int area = brown + yellow;
        
        for(int i=3; i*i <= area; i++){
            if(area % i == 0){
                int len = area / i;
                int yellowArea = (i-2) * (len-2);
                if(yellowArea == yellow){
                    int width = Math.max(i, len);
                    int length = Math.min(i, len);    
                    return new int[]{width, length};
                }
            }
        }
        return new int[2];
    }
}
class Solution {
    public int solution(long num) {
        int count = 0;
        
        while(num != 1 && count < 500){
            count++;
            num = (num % 2 == 0) ? num/2 : 3*num + 1;
            
            if(num == 1)  return count;
            
        }
        
        return count >= 500 ? -1 : count;
    }
}
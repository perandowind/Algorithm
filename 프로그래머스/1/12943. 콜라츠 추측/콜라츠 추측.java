class Solution {
    public int solution(long num) {
        int count = 0;
        if(num == 1) return 0;
        while(true){
            count++;
            if(num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
            
            if(num == 1)  break;
            if(count == 500) return -1;
        }
        
        return count;
    }
}
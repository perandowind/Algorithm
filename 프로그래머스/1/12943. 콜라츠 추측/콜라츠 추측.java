class Solution {
    public int solution(int num) {
        int count = 0;
        
        long value = num;
        while(value != 1 && count <= 500){
            if(value % 2 == 0) value /= 2;
            else value = 3 * value + 1;
            count++;
        }
        
        if(value != 1) return -1;
        
        return count;
    }
}
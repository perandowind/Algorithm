class Solution {
    public long solution(long n) {
        int range = (int) Math.sqrt(n);
        
        for(long i=1; i<= range; i++){
            if(n == i*i) return (i+1)*(i+1);
        }
        
        return -1;
    }
}
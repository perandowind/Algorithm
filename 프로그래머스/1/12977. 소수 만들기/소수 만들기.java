class Solution {
    public int solution(int[] nums) {

        int count = 0;
        
        for(int a=0; a<nums.length; a++){
            for(int b=a+1; b<nums.length; b++){
                for(int c=b+1; c<nums.length; c++){
                    int num = nums[a] + nums[b] + nums[c];
                    if(isPrime(num)) count++;
                }
            }
        }
        
        
        return count;
    }
    
    boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
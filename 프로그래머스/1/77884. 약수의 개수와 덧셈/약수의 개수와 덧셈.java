class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            if(divisor(i) % 2 == 0) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
    
    int divisor(int n){
        int count = 0;
        for(int i=1; i*i<=n; i++){
            if(i*i == n) count += 1;
            else if(n % i == 0) count += 2;
        }
        return count;
    }
}
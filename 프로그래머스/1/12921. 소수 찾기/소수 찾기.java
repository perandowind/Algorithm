class Solution {
    // 1과 소수의 최대공약수 = 1
    // n 최대 100만, 10^6
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                //System.out.println(i);
                answer++;
            } 
        }
        
        return answer;
    }
    
    boolean isPrime(int n){
        
        for(int i=2; i*i<=n; i++){
           if(n % i == 0) return false; 
        }
        return true;
    }
}
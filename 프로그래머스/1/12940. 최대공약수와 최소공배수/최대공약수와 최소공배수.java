class Solution {
    public int[] solution(int n, int m) {
        return new int[]{gcd(n, m), lcm(n, m)};
    }
    
    int gcd(int n, int m ){
        int min = Math.min(n, m);
        int gcd = 1;
        for(int i=2; i<=min; i++){
            if(n % i == 0 && m % i == 0) gcd = i;
        }
        return gcd;
    }
    
    int lcm(int n, int m ){
        int end = n * m;
        int start = Math.min(n, m);
    
        for(int i=start; i<=end; i++){
            if(i % n == 0 && i % m == 0) return i;
        }
        return end;
    }
}
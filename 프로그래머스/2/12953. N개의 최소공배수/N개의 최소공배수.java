class Solution {
    // 2^10 = 1024 * 32 = 32000
    // lcm = b * (a/gcd)
    public int solution(int[] arr) {

        int lcm = 1;
        
        for(int i=0; i<arr.length; i++){
            lcm = lcm(lcm, arr[i]);
        }
        
        return lcm;
    }
    
    int lcm(int a, int b){
        int gcd = gcd(a, b);
        return a * (b / gcd);
    }
    
    int gcd(int a, int b){
        while(b>0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
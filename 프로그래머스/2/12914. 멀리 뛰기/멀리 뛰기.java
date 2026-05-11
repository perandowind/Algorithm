class Solution {
    // 점화식으로 사고 f(n) 
    public long solution(int n) {
        // f(1)=1, f(2)=2, f(3)=3, f(4)=5
        long answer = 0;
        if(n<3) return n;
        long[] arr = new long[n+1];
        arr[1] = 1;
        arr[2] = 2;
        
        for(int i=3; i<=n; i++){
            arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
        }
        
        return arr[n];
    }
}
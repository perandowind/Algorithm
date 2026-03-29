class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; 
        int tmp = 0;
        while(n + tmp >= a){ 
            int val = ((n + tmp) / a) * b;
            tmp = (n + tmp) % a;
            n = val;
            answer += n;
        }
        
        return answer;
    }
}
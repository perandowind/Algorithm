class Solution {
    public int solution(int n) {
        // 홀수개 k => 나누어 떨어지면 가능, 짝수개 k => 짝이므로 k/2 로 나눈값이 홀수인지? (7+8 = 홀수)
        int answer = 0;
        
        for(int i=1; (i*(i+1))/2 <= n; i++){
            if(i % 2 == 1) answer = (n % i == 0) ? answer + 1 : answer;
            else {
                if(n % (i/2) == 0){
                    answer = (n / (i/2)) % 2 == 1 ? answer + 1 : answer;
                }
            }
        }
        
        return answer;
    }
}
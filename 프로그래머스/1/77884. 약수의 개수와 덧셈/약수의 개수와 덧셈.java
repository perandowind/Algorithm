class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            int divisors = count_divisors(i);
            answer = divisors % 2 == 0 ? answer + i : answer - i;
        }
        return answer;
    }
    
    int count_divisors(int n){
        int count = 0;
        for(int i=1; i <= n; i++){
            if(n % i == 0) count++;
        }
        //System.out.println(count);
        return count;
    }
}
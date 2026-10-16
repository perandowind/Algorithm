class Solution {
    public int solution(int left, int right) {
        // 제곱수인 경우 -> 약수가 홀수!! (9: 1, 3, 9)
        int answer = 0;
        for(int n=left; n<=right; n++){
            if(n % Math.sqrt(n) == 0) answer -= n;
            else answer += n;
        }
        return answer;
    }
}

// class Solution {
//     public int solution(int left, int right) {
//         int answer = 0;
//         for(int i=left; i<=right; i++){
//             int divisors = count_divisors(i);
//             answer = divisors % 2 == 0 ? answer + i : answer - i;
//         }
//         return answer;
//     }
    
//     int count_divisors(int n){
//         int count = 0;
//         for(int i=1; i <= n; i++){
//             if(n % i == 0) count++;
//         }
//         //System.out.println(count);
//         return count;
//     }
// }
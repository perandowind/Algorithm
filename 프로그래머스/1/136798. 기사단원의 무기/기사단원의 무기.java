class Solution {

    public int solution(int number, int limit, int power) {
        int[] count = new int[number + 1];    
        for(int i=1; i<=number; i++){
            for(int j=i; j<=number; j += i){
                count[j]++;
            }
        }
        
        int answer = 0;
        for(int i=1; i<count.length; i++){
            answer += count[i] <= limit ? count[i] : power;
        }
        
        return answer;
    }
}

// 기존 약수의 개수 방식
// class Solution {

//     public int solution(int number, int limit, int power) {
//         int[] count = new int[number + 1];    
//         for (int i = 1; i <= number; i++) {
//             for (int j = 1; j <= number / i; j++) {
//                 count[i * j]++;
//             }
//         }
//         int answer = 0;
//         for (int i = 1; i <= number; i++) {
//             if (count[i] > limit) {
//                 answer += power;
//             } else {
//                 answer += count[i];
//             }
//         }
//         return answer;
//     }
// }
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n > 0){
            if(n % 2 == 0){
                n /= 2;
            } else{
                n = n - 1;
                answer++;
            }
        }

        return answer;
    }
}

// public class Solution {
//     public int solution(int n) {
//         return Integer.bitCount(n);
//     }
// }
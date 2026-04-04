import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        // 배열의 요소를 곱하는 모든 경우의 수를 따지는 것 -> 현실적으로 불가능
        // 최소값을 만드는 방법? -> [A에서 최대 요소] X [B에서 최소 요소]
        int len = A.length;
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int idx = len-1;
        for(int i=0; i<len; i++){
            answer += A[i] * B[idx];
            idx--;
        }

        return answer;
    }
}
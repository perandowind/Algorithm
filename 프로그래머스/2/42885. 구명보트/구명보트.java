import java.util.*;

class Solution {
    // 최대 2명 & 무게 제한
    // 양 끝에서 접근하는 투 포인터 전략 사용
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people); // 오름차순 정렬
        
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right){
            if(left == right){
                answer++;
                break;
            }
            if(people[left] + people[right] <= limit){
                left++;
                right--;
                answer++;
            } else{
                right--;
                answer++;
            }
        }
        
        return answer; 
    }
}
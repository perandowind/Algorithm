import java.util.*;

class Solution {
    // 1. numbers 의 모든 수 조합 -> 순열, Set에 저장
    // 2. 소수 판별 로직
    HashSet<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        char[] nums = numbers.toCharArray();
        boolean[] visited = new boolean[nums.length];
        
        backtracking("", nums, visited, 0);
        
        for(int i : set){
            if(isPrime(i)) answer++;
        }
        
        return answer;
    }
    
    boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2; i*i<=n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    void backtracking(String cur, char[] nums, boolean[] visited, int depth){
        if(depth == nums.length){
            return;
        }
        
        for(int i=0; i<nums.length; i++){
            if(!visited[i]){
                String str = cur + nums[i];
                //System.out.println(Integer.parseInt(str));
                set.add(Integer.parseInt(str));
                visited[i] = true;
                
                backtracking(str, nums, visited, depth + 1);
                
                visited[i] = false;
            }
            
        }
    }
}
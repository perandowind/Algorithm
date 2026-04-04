class Solution {
    boolean solution(String s) {
        int answer = 0;
        for(String str : s.split("")){
            if(answer < 0) return false;
            if(str.equals("(")) answer++;
            else answer--;
        }

        return answer == 0;
    }
}
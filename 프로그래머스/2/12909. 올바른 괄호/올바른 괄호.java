class Solution {
    boolean solution(String s) {
        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') return false;
        int answer = 0;
        for(String str : s.split("")){
            if(answer < 0) return false;
            if(str.equals("(")) answer++;
            else answer--;
        }

        return answer == 0;
    }
}
class Solution {
    public String[] solution(String[] quiz) {
        // ["3", "-", "4", "=", "-3"] 무조건 5개 원소인 배열
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            int compare = 0, result = Integer.valueOf(arr[4]);
            if(arr[1].equals("+")) compare = Integer.valueOf(arr[0]) + Integer.valueOf(arr[2]);
            else compare = Integer.valueOf(arr[0]) - Integer.valueOf(arr[2]);
            
            if(compare == result) answer[i] = "O";
            else answer[i] = "X";
        }
        
        
        return answer;
    }
}
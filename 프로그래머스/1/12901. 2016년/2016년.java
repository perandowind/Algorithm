class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 2016.01.01 = 5 , 윤년 = 2월29일까지 
        // 1월 3일 = 일, (5 + 2(차이 일 수) )/ 7
        int index = 5;
        
        for(int i=0; i<a-1; i++){
            index += days[i];
        }
        
        index += (b-1);
        index %= 7;
        answer = week[index];
        
        return answer;
    }
}
class Solution {
    public int solution(int[] numbers) {
        int answer = 45; // 1~9 총합
        for(int number : numbers){
            answer -= number;
        }
        return answer;
    }
}
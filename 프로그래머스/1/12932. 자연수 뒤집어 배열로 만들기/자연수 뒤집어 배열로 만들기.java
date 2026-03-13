class Solution {
    public int[] solution(long n) {
        int len = String.valueOf(n).length();
        int[] answer = new int[len];
        int index = 0;
        while(n >= 1){
            answer[index] = (int)(n % 10);
            n /= 10;
            index++;
        }
        
        return answer;
    }
}
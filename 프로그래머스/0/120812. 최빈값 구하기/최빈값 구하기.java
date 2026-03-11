class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] countArr = new int[1000];
        for(int i=0; i<array.length; i++){
            countArr[array[i]] += 1;
        }
        int max = countArr[array[0]]; //빈도수
        int maxNum = array[0]; //최대값
        for(int i=0; i<countArr.length; i++){
            if(countArr[i] > max){
                max = countArr[i];
            }
        }
        int count = 0;
        int maxIndex = 0;
        for(int i=0; i<countArr.length; i++){
            if(countArr[i] == max) {
                count++;
                maxIndex = i;
            }
        }
        if(count == 1) answer = maxIndex;    
        else answer =-1;    
        
        return answer;
    }
}
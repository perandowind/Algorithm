import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] arr1 = {1, 2, 3, 4, 5}; // 5
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
        
        for(int i=0; i<answers.length; i++){
            int arr1_idx = i % 5;
            int arr2_idx = i % 8;
            int arr3_idx = i % 10;
            if(answers[i] == arr1[arr1_idx]) answer[0]++;
            if(answers[i] == arr2[arr2_idx]) answer[1]++;
            if(answers[i] == arr3[arr3_idx]) answer[2]++;
        }
        
        int max = 0;
        for(int i : answer){
            if(i > max){
                max = i;  
            } 
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<answer.length; i++){
            if(max == answer[i]) {
                list.add(i+1);
            }
        }
        
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
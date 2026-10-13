import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i % divisor == 0) list.add(i);
        }
        
        if(list.size() == 0) return new int[]{-1};
        
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}

// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, int divisor) {
//         int count = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] % divisor == 0) count++;
//         }
//         int[] answer;
//         if(count != 0) {
//             answer = new int[count];
//         } else{
//             return new int[]{-1};  
//         } 
        
//         int index = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] % divisor == 0) answer[index++] = arr[i];
//         }
//         Arrays.sort(answer);
//         return answer;
//     }
// }
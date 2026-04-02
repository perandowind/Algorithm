import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                String str = photo[i][j];
                sum += map.getOrDefault(str, 0);
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}

// class Solution {
//     public int[] solution(String[] name, int[] yearning, String[][] photo) {
//         int[] answer = new int[photo.length];
        
//         for(int i=0; i<photo.length; i++){
//             int sum = 0;
//             for(String s : photo[i]){
//                 for(int j=0; j<name.length; j++){
//                     if(name[j].equals(s)) sum += yearning[j];
//                 }
//             }
//             answer[i] = sum;
//         }
        
//         return answer;
//     }
// }
import java.util.*;

class Solution {
    public String solution(String s) {
        // 'A'=65 , 'a'=97
        char[] tmp = s.toCharArray();
        Character[] arr = new Character[tmp.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = tmp[i];
        }
        Arrays.sort(arr, (l1, l2) -> {
            return l2 - l1;
        });
        StringBuilder sb = new StringBuilder();
        for(Character c : arr){
            sb.append(c);
        }
        
        
        return sb.toString();
    }
}
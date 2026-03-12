import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, (l1, l2) -> {
            return Integer.parseInt(l2) - Integer.parseInt(l1);
        });
        
        StringBuilder sb = new StringBuilder();
        
        for(String s : arr){
            sb.append(s);
        }
        return Long.parseLong(sb.toString());
    }
}
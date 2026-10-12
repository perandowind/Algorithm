import java.util.*;

class Solution {
    public long solution(long n) {
        String[] array = String.valueOf(n).split("");
        Arrays.sort(array, (l1, l2) -> {
            return Integer.parseInt(l2) - Integer.parseInt(l1); // 내림차순정렬
        });
        
        StringBuilder sb = new StringBuilder();
        for(String s : array){
            sb.append(s);
        }
        
        return Long.parseLong(sb.toString());
    }
}
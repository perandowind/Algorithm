import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // Arrays.sort -> charAt(i)
        Arrays.sort(strings, (l1, l2) -> {
            if(l1.charAt(n) == l2.charAt(n)){
                return l1.compareTo(l2);
            }else{
                return l1.charAt(n) - l2.charAt(n);   
            }
        });
        
        return strings;
    }
}
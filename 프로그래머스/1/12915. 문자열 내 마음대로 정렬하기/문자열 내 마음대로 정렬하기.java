import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i=0; i<strings.length; i++){
            Arrays.sort(strings, (s1, s2) -> {
                if(s1.charAt(n) == s2.charAt(n)){
                    return s1.compareTo(s2);
                }
               return s1.charAt(n) - s2.charAt(n);
            });
        }
        return strings;
    }
}
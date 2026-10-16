import java.util.*;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        
        return new StringBuilder(new String(chars)).reverse().toString();
    }
}

// class Solution {
//     public String solution(String s) {
//         // char[] chars = s.toCharArray();
//         String[] strs = s.split("");
//         Arrays.sort(strs, (s1, s2) -> s2.compareTo(s1));
        
//         return String.join("", strs);
//     }
// }
import java.util.*;

class Solution {
    public String solution(String s) {
        // 'A'=65 , 'a'=97
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
    }
}
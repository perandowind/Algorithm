import java.util.*;
class Solution {
    public String solution(String s, int n) {
        // 65 A, 97 a
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(Character.isUpperCase(c)){
                c = (char)((c - 'A' + n) % 26 + 'A');
            }else if(Character.isLowerCase(c)){
                c = (char)((c - 'a' + n) % 26 + 'a');
            }
                
            sb.append(c);
        }
        return sb.toString();
    }
}
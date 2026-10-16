class Solution {
    public String solution(String s) {
        int len = s.length();
        if(len % 2 == 1){
            return s.substring(len/2, len/2 + 1); // 5/2 = 2
        }else{
            return s.substring(len/2 -1, len/2 + 1); // 6/2 = 3 -> 2~3 필요
        }
    }
}
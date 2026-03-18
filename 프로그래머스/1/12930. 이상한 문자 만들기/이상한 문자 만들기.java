class Solution {
    public String solution(String s) {
        int len = s.length();
        int index = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<len; i++){
            if(s.charAt(i) == ' '){
                sb.append(' ');
                index = 0;
                continue;
            }
            if(index % 2 == 0) {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                index++;
            }else if(index % 2 == 1) {
                sb.append(String.valueOf(s.charAt(i)).toLowerCase());
                index++;
            }
        }
            
            
        return sb.toString();
    }
}
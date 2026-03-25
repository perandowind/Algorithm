class Solution {
    public String solution(String s, int n) {
        // 'A' 65 ~ 90, 'a' 97 26개
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        
        for(char c : arr){
            if(c == ' ') {
                sb.append(c);
                continue;
            }else{
                if(c <= 'Z'){
                    c =(char) ((c + n) <= 'Z' ? (c + n) : (c + n) % ('Z'+1) + 'A');
                    sb.append(c);
                }else{
                    c =(char) ((c + n) <= 'z' ? (c + n) : (c + n) % ('z'+1) + 'a');
                    sb.append(c);
                }
                
            }
            
        }
        
        return sb.toString();
    }
}
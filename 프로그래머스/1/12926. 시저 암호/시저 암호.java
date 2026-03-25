class Solution {
    public String solution(String s, int n) {
        // 'A' 65 ~ 90, 'a' 97 26개
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        
        for(char c : arr){
            if(c == ' ') {
                sb.append(c);
            }else{
                if(c <= 'Z'){
                    c = (char)('A' + (c + n - 'A') % 26);
                    sb.append(c);
                }else{
                    c = (char)('a' + (c + n - 'a') % 26);
                    sb.append(c);
                }
                
            }
            
        }
        
        return sb.toString();
    }
}
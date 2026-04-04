class Solution {
    public String solution(String s) {
        // 공백문자가 연속해서 나올 수 있습니다. -> 쪼개서 생각하지 X
        StringBuilder sb = new StringBuilder();
        String lowers = s.toLowerCase();
        boolean isFirst = true;
        
        for(char c : lowers.toCharArray()){
            if(c == ' '){
                isFirst = true;
                sb.append(c);
            } else{
                if(isFirst){
                    sb.append(String.valueOf(c).toUpperCase());
                    isFirst = false;
                } else sb.append(c);
            }
        }
        
        
        
        return sb.toString();
    }
}
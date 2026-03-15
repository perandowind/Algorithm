class Solution {
    public boolean solution(String s) {
        int len = s.length();
        if(!(len == 4 || len == 6)) return false;
        else{
            for(char c : s.toCharArray()){
                if(c < 48 || c > 57) return false;
            }   
        }
        // System.out.println((int)'0');
        // System.out.println((int)'1');
        // System.out.println((int)'9');
        
        return true;
    }
}
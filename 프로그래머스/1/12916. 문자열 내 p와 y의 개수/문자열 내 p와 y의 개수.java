class Solution {
    boolean solution(String s) {
        
        String noP = s.replaceAll("[pP]", "");
        String noY = s.replaceAll("[yY]", "");

        return noP.length() == noY.length();
    }
}
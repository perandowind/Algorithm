class Solution {
    boolean solution(String s) {

        String noP = s.replaceAll("[pP]", ""); // [] 이 중 아무거나 하나
        String noY = s.replaceAll("y|Y", "");  // OR
        System.out.println(noP);
        System.out.println(noY);
        return noP.length() == noY.length();
    }
}
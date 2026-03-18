class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("");
        int cnt = 0;
        for(String str : arr){
            cnt = str.equals(" ") ? 0 : cnt + 1;
            String input = cnt % 2 == 1 ? str.toUpperCase() : str.toLowerCase();
            sb.append(input);
        }
            
        return sb.toString();
    }
}
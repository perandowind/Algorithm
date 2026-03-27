class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<food.length; i++){
            int len = food[i]/2;
            for(int j=0; j<len; j++){
                sb.append(i);
            }
        }
        String origin = sb.toString();
        String reversed = sb.reverse().toString();
        
        
        return origin + "0" + reversed;
    }
}
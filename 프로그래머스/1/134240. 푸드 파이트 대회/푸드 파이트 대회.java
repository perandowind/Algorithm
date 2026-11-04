class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<food.length; i++){
            int iter = food[i] / 2;
            for(int j=0; j<iter; j++){
                sb.append(i);
            }
        }
        
        String reversed = new StringBuilder(sb).reverse().toString();
        
        sb.append("0");
        sb.append(reversed);
        return sb.toString();
    }
}
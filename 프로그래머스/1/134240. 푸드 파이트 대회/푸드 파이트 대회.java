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

// class Solution {
//     public String solution(int[] food) {
//         String answer = "0";
        
//         for(int i=food.length-1; i>0; i--){
//             for(int j=0; j<food[i]/2; j++){
//                 answer = i + answer + i;
//             }
//         }
//         return answer;
//     }
// }
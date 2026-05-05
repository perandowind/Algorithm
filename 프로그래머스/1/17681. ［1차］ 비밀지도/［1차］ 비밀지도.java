class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            String merged = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            String row = String.format("%" + n + "s", merged) // " 1101"
                .replace(" ", "0")
                .replace("1", "#")
                .replace("0", " ");
            
            answer[i] = row;
        }
        
        return answer;
    }
}


// class Solution {
//     public String[] solution(int n, int[] arr1, int[] arr2) {
        
//         String[][] map = new String[n][n];
        
//         for(int i=0; i<n; i++){
//             String bin = Integer.toUnsignedString(arr1[i], 2); // "1001"
//             bin = bin.length() < n ? "0".repeat(n-bin.length()) + bin : bin; // "01001"
//             String[] temp = bin.split(""); // ["0","1","0","0","1"]
//             for(int j=0; j<temp.length; j++){
//                 map[i][j] = temp[j].equals("1") ? "#" : " ";
//             }
//         }
        
//         for(int i=0; i<n; i++){
//             String bin = Integer.toUnsignedString(arr2[i], 2); // "1001"
//             bin = bin.length() < n ? "0".repeat(n-bin.length()) + bin : bin; // "01001"
//             String[] temp = bin.split(""); // ["0","1","0","0","1"]
//             for(int j=0; j<temp.length; j++){
//                 if(!map[i][j].equals("#")){
//                     map[i][j] = temp[j].equals("1") ? "#" : " ";
//                 }
//             }
//         }
        
//         String[] answer = new String[n];
        
        
//         for(int i=0; i<n; i++){
//             StringBuilder sb = new StringBuilder();    
//             for(int j=0; j<n; j++){
//                 sb.append(map[i][j]);
//             }
//             answer[i] = sb.toString();
//         }
        
//         return answer;
//     }
// }
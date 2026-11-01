class Solution {
    public boolean solution(String s) {
        
        if(s.length()==4 || s.length()==6){
            return s.matches("^[0-9]+$");
        }
        else return false;
    }
}

// class Solution {
//     public boolean solution(String s) {
        
//         if(s.length()==4 || s.length()==6){
//             String str = s.replaceAll("[0-9]","");
//             if(str.length()==0) return true;
//             else return false;
//         }else {
//             return false;
//         }
//     }
// }
class Solution {
    public String solution(String phone_number) {
        // 11 -> 7 8 9 10 
        int start_idx = phone_number.length() - 4;
        String[] array = phone_number.split("");
        
        StringBuilder sb = new StringBuilder();
        sb.append(new String("*".repeat(phone_number.length() - 4)));
        for(int i=start_idx; i<phone_number.length(); i++){
            sb.append(array[i]);
        }
        
        return sb.toString();
    }
}
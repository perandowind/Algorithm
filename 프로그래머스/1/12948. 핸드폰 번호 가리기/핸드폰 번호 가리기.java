class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        sb.append(phone_number);
        int len = phone_number.length(); // 9 -> 0, 5
        int replace_len = len - 4;
        String replaceStr = "*".repeat(replace_len);
        sb.replace(0, replace_len, replaceStr);
        
        return sb.toString();
    }
}
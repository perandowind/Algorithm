class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int trans_cnt = 0, remove_cnt = 0;
        
        while(s.length() > 1){
            StringBuilder sb = new StringBuilder();
            for(char c : s.toCharArray()){
                if(c == '1') sb.append(c);
            }
            int len = sb.length(); // 0 제거 후 길이
            remove_cnt += s.length() - len;
            s = Integer.toString(len, 2);
            trans_cnt++;
        }
        answer[0] = trans_cnt;
        answer[1] = remove_cnt; 
        return answer;
    }
}
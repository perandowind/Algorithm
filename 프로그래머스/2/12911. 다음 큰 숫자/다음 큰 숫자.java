class Solution {
    public int solution(int n) {
        // 이진수 변환 메서드 Integer.toString(); 
        String nStr = Integer.toString(n, 2);
        int cnt1 = 0;
        int cnt2 = 0;
        for(char c : nStr.toCharArray()){
            if(c == '1') cnt1++;
        }
        
        while(cnt1 != cnt2){
            n++;
            String tmp = Integer.toString(n, 2);
            cnt2 = 0;
            for(char c : tmp.toCharArray()){
                if(c == '1') cnt2++;
            }
        }
        
        return n;
    }
}
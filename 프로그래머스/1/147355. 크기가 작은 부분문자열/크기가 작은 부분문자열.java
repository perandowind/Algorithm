class Solution {
    public int solution(String t, String p) {
        // 제약조건 중요!!! => 1 ≤ p의 길이 ≤ 18 100,000,000,000,000,000 / 10^17 > 2*10^9(21억)
        int len = p.length(), answer = 0;
        long comp = Long.parseLong(p);
        for(int i=0; i <= t.length() - len; i++){
            long val = Long.parseLong(t.substring(i, i + len));
            if(val <= comp) answer++;
        }
        
        return answer;
    }
}
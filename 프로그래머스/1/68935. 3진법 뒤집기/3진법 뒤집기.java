class Solution {
    public int solution(int n) {
        // 0 1 2 -> n진법 문자열로 변환 -> Integer.toString(number, n);
        // n진법 문자열을 10진수로 변환 -> Integer.parseInt(string, n);
        String trit = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(trit).reverse();
        int answer = Integer.parseInt(sb.toString(), 3);
        
        return answer;
    }
}
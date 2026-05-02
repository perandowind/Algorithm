class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 1,000,000 = 분모 곱 int내에서 가능
        // 기약분수꼴 분자, 분모 gcd 로 나눠주면됨
        int[] answer = new int[2];
        
        int newDenom = denom1 * denom2;
        int newNumer = (numer1 * denom2) + (numer2 * denom1);
        
        int gcd = gcd(newDenom, newNumer);
        answer[0] = newNumer / gcd;
        answer[1] = newDenom / gcd;
        
        return answer;
    }
    
    int gcd(int a, int b){
        while(b > 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
class Solution {
    // 최소공배수 = 두 수의 곱 / 최대공약수 
    public int[] solution(int n, int m) {
        return new int[]{gcd(n,m), (n*m)/gcd(n,m)};
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
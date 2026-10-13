class Solution {
    public boolean solution(int x) {
        int ori_x = x, sum_digit = 0;
        while(x>0){
            sum_digit += x % 10;
            x /= 10;
        }
        return ori_x % sum_digit == 0 ? true : false;
    }
}
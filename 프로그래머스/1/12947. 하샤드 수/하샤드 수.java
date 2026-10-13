class Solution {
    public boolean solution(int x) {
        // chars -> intstream으로 변환
        // int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        int sum = String.valueOf(x).chars().map(Character::getNumericValue).sum();
        return x % sum == 0;
    }
}

// class Solution {
//     public boolean solution(int x) {
//         int ori_x = x, sum_digit = 0;
//         while(x>0){
//             sum_digit += x % 10;
//             x /= 10;
//         }
//         return ori_x % sum_digit == 0;
//     }
// }
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        // (1), 3, 6, 8
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.add(arr[0]);
        int index = 1;
        
        while(index < arr.length){
            if(arr[index] - stack.peekLast() > k) {
                stack.add(stack.peekLast() + k);
                continue;
            }else{
                stack.add(arr[index]);
                index++;
            }
        }
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}

// Stack을 사용하면 오름차순 그대로 배열변환 가능
// class Solution {
//     public int[] solution(int[] arr, int k) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(arr[0]);
//         int index = 1;
        
//         while(index < arr.length){
//             if(arr[index] - stack.peek() > k) {
//                 stack.push(stack.peek() + k);
//                 continue;
//             }else{
//                 stack.push(arr[index]);
//                 index++;
//             }
//         }
        
//         return stack.stream().mapToInt(Integer::intValue).toArray();
//     }
// }

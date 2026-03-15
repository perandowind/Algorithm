import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        stack.push(arr[0]);
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(stack.peek() != arr[i]) {
                list.add(arr[i]);
                stack.push(arr[i]);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
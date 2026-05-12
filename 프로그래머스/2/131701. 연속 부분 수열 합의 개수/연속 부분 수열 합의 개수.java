import java.util.*;
// 개선 코드
class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        
        int[] twice = new int[elements.length * 2];
        
        for(int i=0; i<elements.length * 2; i++){
            twice[i] = elements[i % elements.length];
        }
        
        for(int i=0; i<elements.length; i++){
            int sum = 0;
            for(int size=1; size<=elements.length; size++){
                sum += twice[i + size - 1];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}

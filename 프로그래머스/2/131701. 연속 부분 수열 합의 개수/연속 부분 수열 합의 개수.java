import java.util.*;
// 개선 코드2 (HashSet 초기 크기 설정 & 배열 복사 개선)
class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        HashSet<Integer> set = new HashSet<>(n * n);
        
        int[] twice = new int[n * 2];
        
        // System.arraycopy(원본, 원본시작위치, 목적지, 목적지시작위치, 복사할길이)
        System.arraycopy(elements, 0, twice, 0, n);
        System.arraycopy(elements, 0, twice, n, n);
        
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int size=1; size<=n; size++){
                sum += twice[i + size - 1];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}

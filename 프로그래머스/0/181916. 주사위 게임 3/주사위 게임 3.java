import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : new int[]{a,b,c,d}){
            map.put(i, map.getOrDefault(i, 0) + 1);    
        }
        
        if(map.size() == 1){
            int p = a;
            answer = 1111 * p;
        }else if(map.size() == 2){
            int p = 0;
            int q = 0;
            if(map.get(a) == 3 || map.get(a) == 1){
                for(int key : map.keySet()){
                    if(map.get(key) == 3) p = key;
                    else q = key;
                } answer = (10*p+q)*(10*p+q);
            } else{
                p = a;
                q = a == b ? c : b;
                answer = (p+q) * Math.abs(p-q);
            }
        }else if(map.size() == 3){
            for(int key : map.keySet()){
                if(map.get(key) == 1) answer *= key;
            }
        }else{
            answer = Math.min(Math.min(a,b), Math.min(c,d));
        }
        
        return answer;
    }
}
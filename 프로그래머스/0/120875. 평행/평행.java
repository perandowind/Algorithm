class Solution {
    public int solution(int[][] dots) {
        // 평행하다 = 기울기가 같다
        // 모든 경우의 수 = 3
        int answer = 0;
        int x1 = dots[0][0], y1 = dots[0][1],
            x2 = dots[1][0], y2 = dots[1][1],
            x3 = dots[2][0], y3 = dots[2][1],
            x4 = dots[3][0], y4 = dots[3][1];
        
        
        int incline1 = (x1-x2) * (y3-y4);
        int incline2 = (x3-x4) * (y1-y2);
        if(incline1 == incline2) return 1;
        
        incline1 = (x1-x3) * (y2-y4);
        incline2 = (x2-x4) * (y1-y3);
        if(incline1 == incline2) return 1;
        
        incline1 = (x1-x4) * (y2-y3);
        incline2 = (x2-x3) * (y1-y4);
        if(incline1 == incline2) return 1;
        
        return answer;
    }
}
class Solution {
    // 위험지역 = 1, 안전지역 = 0 으로 우선 변환 -> 0만 카운트
    public int solution(int[][] board) {
        int answer = 0;
        int r = board.length, c = board[0].length;
        
        int[][] temp = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                
                if(board[i][j] == 1){
                    int sr = Math.max(0, i-1);
                    int sc = Math.max(0, j-1);
                    int er = Math.min(r-1, i+1);
                    int ec = Math.min(c-1, j+1);
                    for(int n=sr; n<=er; n++){
                        for(int m=sc; m<=ec; m++){
                            temp[n][m] = 1;
                        }
                    }
                }
            }
        }
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(temp[i][j] == 0) answer++;
            }
        }
        
        
        return answer;
    }
}
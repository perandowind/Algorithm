class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(String s : photo[i]){
                for(int j=0; j<name.length; j++){
                    if(name[j].equals(s)) sum += yearning[j];
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String[] seoul) {
        
        int place = 0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                place = i;
                break;
            } 
        }
        
        return new String("김서방은 " + place + "에 있다");
    }
}
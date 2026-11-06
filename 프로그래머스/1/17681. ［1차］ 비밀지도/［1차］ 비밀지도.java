class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 1=#, 0=" " 이므로 각 인덱스의 원소를 | 이진수 OR 연산하고 이진비트로 변환
        String[] answer = new String[n];
        
        for(int i=0; i<arr1.length; i++){
            int temp = arr1[i] | arr2[i]; // 이진수 OR 연산
            String binstr = Integer.toString(temp, 2);
            String formatted = String.format("%" + n + "s", binstr).replace(' ', '0');
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                if(formatted.charAt(j) == '0') sb.append(" ");
                else sb.append("#");
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}
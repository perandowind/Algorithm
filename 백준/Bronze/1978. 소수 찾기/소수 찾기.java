import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int count = 0;
        for(int num : arr){
            if(isPrime(num)) count++;
        }
        
        System.out.println(count);
    }
    
    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i=2; i*i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
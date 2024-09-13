import java.io.*; 
import java.util.*;
public class Main { 
    public static long sumXOR(int[] arr) {
        // write your code here
        int ans = 0;
        for(int i = 0;i < arr.length;i++)
        {
            for(int j = i + 1;j < arr.length;j++)
            {
                ans += arr[i] ^ arr[j];
            }
        }
        return ans;
    }

    public static void main(String args[]) {
         Scanner input = new Scanner(System.in);
         int n = input.nextInt(); 
         int arr[] = new int[n]; 
         for(int i = 0 ; i < n ; i++){
             arr[i] = input.nextInt(); 
         }
         long ans = sumXOR(arr); 
         System.out.println(ans); 
    }
}

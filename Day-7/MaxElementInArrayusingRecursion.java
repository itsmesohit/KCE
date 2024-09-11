import java.io.*;
import java.util.Scanner;

public class Main {
    public static int maxElementInArray(int[] arr,int n,int i){
        //write your code here
        if(i == arr.length)
         return 0;
         int max = arr[i];
         return max = Math.max(max,maxElementInArray(arr,n,i + 1));
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int ans=maxElementInArray(nums,n,0);
        System.out.print(ans);
    }
}

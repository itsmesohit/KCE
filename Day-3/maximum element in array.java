
import java.io.*;
import java.util.Scanner;

public class Main {

    public static int maxElementInArray(int[] arr,int n){
        //write your code here
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
            }
        
        }
        return max;

    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int ans=maxElementInArray(nums,n);
        System.out.print(ans);
    }
}

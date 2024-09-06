import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        
        long ans[] = obj.FindProductOfArrayExceptSelf(n,nums);
        
        for(int i=0; i<n ; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
class Solution{
    public long[] FindProductOfArrayExceptSelf(int n, int[] a){
        //write code here
        int product=1;
        long ans[]= new long[n];
        for(int i=0;i<n;i++){
            product*=a[i];
            
        }
        for(int i=0;i<n;i++){
            ans[i]=product/a[i];
        }
        return ans;
    }
}

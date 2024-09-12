import java.util.*;
import java.io.*;

class Solution{
    public static int longestContinuousInc(int[] nums) {
        //Write your code here
        int count = 1;
        int max = 1;
        for(int i = 0;i < nums.length - 1;i++)
        {
            if(nums[i] < nums[i + 1])
             count++;
             else
              count = 1;
             if(count > max)
               max = count;
        }
       return max;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution obj= new Solution();
        System.out.println(obj.longestContinuousInc(a));
    }
}

import java.util.*;

class Solution {
    public int pivotIndex(int[] nums) {
        //Write code here
       int leftsum = 0,pivot = 0,rightsum = 0;
       for(int i = 1;i < nums.length;i++)
       {
           rightsum += nums[i];
       }
       while(pivot < nums.length - 1 && leftsum != rightsum)
       {
           pivot++;
           rightsum -= nums[pivot];
           leftsum += nums[pivot - 1];
       }
       if(leftsum == rightsum)
         return pivot;
       return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.pivotIndex(arr);
        System.out.println(result);
        sc.close();
    }
}

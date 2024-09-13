import java.util.*;

class Solution {
    static int solve(int size, int arr[]) {
        //Write your code here
        int start = 0;
        int end  = size - 1;
        int ans = 0;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] == 0)
             {
                 start = mid + 1;
             }
             else if(arr[mid] == 1)
             {
                 ans = size - mid;
                 end = mid - 1;
             }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.solve(n,array));
    }
}

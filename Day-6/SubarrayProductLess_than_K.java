import java.util.*;

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //Write code here
        if(k==0)
        return 0;
        int ans=0;
        int l=0;
        int psum=1;
        for(int i=0;i<nums.length;i++){
            psum*=nums[i];
            while(l<=i && psum>=k){
                psum/=nums[l++];
            }
            ans+=(i-l+1);
        }
        return ans;
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
        int k;
        k = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.numSubarrayProductLessThanK(arr, k);
        System.out.println(result);
        sc.close();
    }
}

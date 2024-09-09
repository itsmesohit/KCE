import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        Solution object =new Solution();
        long ans = object.FindmaxSubarraySum(a,n);
        System.out.println(ans);
    }
}
class Solution{
    public long FindmaxSubarraySum(int a[],int n){
        //Write code here
        int max = Integer.MIN_VALUE;
        int sum = 0;
       for(int i = 0;i < n;i++)
       {
           sum += a[i];
           if(sum > max)
              max = sum;
            if(sum < 0)
              sum = 0;
       }
       return max;
    }
}

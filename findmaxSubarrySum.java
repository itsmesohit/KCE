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
        long  max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+a[k];
                }
                if(sum > max){
                    max=sum;
                }
            }
        }
        return max;
       
    }
}

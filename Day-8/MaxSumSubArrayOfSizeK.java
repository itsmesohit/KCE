import java.util.*;
class Solution{
    public static int maxSubSize(int[] arr , int k){
        //Write your code here
	    int sum = 0;
	    for(int i = 0;i < k;i++)
	    {
	        sum += arr[i];
	    }
	    int max = sum;
	    for(int i = k;i < arr.length;i++)
	    {
	        sum = sum - arr[i - k] + arr[i];
	        if(sum > max)
	          max = sum;
	    }
	    return max;
    }	
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Solution.maxSubSize(arr,k));
    }
}

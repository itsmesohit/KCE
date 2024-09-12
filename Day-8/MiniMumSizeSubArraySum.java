import java.util.*;
 
public class Main {
    public static int minSubArrayLength(int arr[], int target, int n) {
        // write your code here
        int i = 0;
        int j = 0;
        int sum = 0;
        int minlen = n + 1;
        while(i < n && j < n)
        {
            sum += arr[j];
             while(sum >= target)
             {
                 int len = j - i + 1;
                 if(len < minlen)
                  {
                      minlen = len;
                  }
                  sum = sum - arr[i];
                  i++;
             }
             j++;
        }
        if(minlen == n + 1)
         return 0;
        return minlen;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minSubArrayLength(arr, target, n));
    }
}

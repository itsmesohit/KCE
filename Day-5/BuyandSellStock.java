import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        int ans = Solution.findBestTimeToBuyAndSell(n,a);
        System.out.println(ans);
    }
}
class Solution {
    static int findBestTimeToBuyAndSell(int n, int[] prices) {
        //write your code here
        int bprice = prices[0];
        int profit = 0;
        for(int i = 1;i < n;i++)
        {
            if(bprice > prices[i])
            {
                bprice = prices[i];
            }
            profit = Math.max(profit,prices[i] - bprice);
        }
        return profit;
    }
}

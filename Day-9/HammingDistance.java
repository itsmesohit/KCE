import java.util.*;

class Solution{
    static int findHammingDistance(int a,int b){
        //write code here
        int t = a ^ b;
        int cnt = 0;
        while(t > 0)
        {
            if((t & 1) == 1)
              cnt++;
             
             t >>= 1;
        }
        return cnt;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution obj = new Solution();
        int ans=obj.findHammingDistance(a,b);
        System.out.println(ans);
    }
}

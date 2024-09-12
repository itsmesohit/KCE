import java.util.*;
class Solution {
    public  static int computeXOR(int n)
    {
       //Write your code here
       if(n % 4 == 0)
         return n;
        if(n % 4 == 1)
          return 1;
        if(n % 4 == 2)
          return n + 1;
         else
           return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution.computeXOR(n));
    }
}

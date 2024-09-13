import java.util.*;
import static java.lang.Math.ceil;

class AlgoTutor {
    public void isPerfectSquare(int n) {
        // Write your code here
        int start = 0;
        int end = n / 2;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(mid * mid == n){
             System.out.println("YES");
             return;
            }
            else if(mid * mid > n)
              end = mid - 1;
            else
              start = mid + 1;
        }
        if(start > end)
         System.out.println("NO");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AlgoTutor Obj = new AlgoTutor();
        Obj.isPerfectSquare(n);
    }
}

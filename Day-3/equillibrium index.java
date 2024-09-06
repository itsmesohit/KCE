import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int ans = Solution.findEquilibriumIndex(a);
        System.out.println(ans);
    }
}

class Solution {
    static int findEquilibriumIndex(int[] a) {
        //write your code here
        int sum1,sum2;
        for(int i=0;i<a.length;i++){
            sum1=0;
            for(int j=i-1;j>=0;j--){
                sum1+=a[j];
            }
            sum2=0;
            for(int k=i+1;k<a.length;k++){
                sum2+=a[k];
            }
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
}

import java.util.*;

class Solution {
    public static int[] SumArray(int[] a){
        //Write your code here
        int sum = 0;
        for(int i = 0;i < a.length;i++)
        {
            sum += a[i];
            a[i] = sum;
        }
        return a;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] input = new int[n];
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int [] arr=(Solution.SumArray(input));

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}

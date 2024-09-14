import java.util.*;

public class Main {
    public static int[] solveSelectionSort(int[] arr) {
        // Write your code here
        for(int i = 0;i < arr.length;i++)
        {
            int last = arr.length - 1 - i;
            int max = 0;
            for(int j = 1;j <= last;j++)
            {
                if(arr[j] > arr[max])
                  max = j;
            }
            int t = arr[last];
            arr[last] = arr[max];
            arr[max] = t;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = solveSelectionSort(arr);

        for(int a : ans)
            System.out.print(a + " ");
    }
}

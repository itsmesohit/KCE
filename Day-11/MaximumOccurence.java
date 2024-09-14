import java.util.*;

public class Main {
    static int maximumOccurrence(int arr[], int n) {
        //Write code here
        Arrays.sort(arr);
        int maxcnt = 1;
        int currcnt = 1;
        int ans = arr[0];
        for(int i = 1;i < n;i++)
        {
            if(arr[i] == arr[i - 1])
              currcnt++;
            else
              currcnt = 1;
            if(currcnt > maxcnt){
               maxcnt = currcnt;
              ans = arr[i];
            }
        }
        return ans; 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximumOccurrence(arr, n));
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();

        ArrayOperations(arr, n);
    }

    public static void ArrayOperations(int[] arr, int n) {
        // Write your code here
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int avg=sum/n;
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            System.out.print(sum+" ");
            System.out.print(avg+" ");
            System.out.print(max);
        }
    
}

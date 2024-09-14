import java.util.*;

public class Main {
	 static int[] Sorting01(int n,int[] arr){
        // Your code here
        int i = 0;
        for(int j = 0;j < n;j++)
        {
            if(arr[j] == 0)
              arr[i++] = arr[j];
        }
        while(i < n)
        {
            arr[i++] = 1;
        }
        return arr;
    }
	
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int[] ans=Sorting01(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }
}

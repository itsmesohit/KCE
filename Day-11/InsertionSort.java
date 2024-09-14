import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        
        insertionSort(array,n);
    }
	 static void insertionSort(int arr[], int n)
    {
        //Write your code here
        for(int i = 0;i < n - 1;i++)
        {
            for(int j = i + 1;j > 0;j--)
            {
                if(arr[j] < arr[j - 1])
                {
                    int t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
                }
            }
        }
        for(int i = 0;i < n;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}

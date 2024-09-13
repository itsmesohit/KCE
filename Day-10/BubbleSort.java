import java.io.*;
import java.util.*;

public class Main {
    static void bubbleSort(int a[], int n)
    {
        //Write your code here
        int count = 0;
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n - 1 - i;j++)
            {
                if(a[j] > a[j + 1])
                {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(a[0]);
        System.out.println(a[n - 1]);
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
       bubbleSort(arr, n);
    }
}

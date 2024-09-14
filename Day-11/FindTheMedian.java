import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         String[] arr_a = br.readLine().split(" ");
         int[] a = new int[n];
         for(int i_a = 0; i_a < arr_a.length; i_a++)
         {
         	a[i_a] = Integer.parseInt(arr_a[i_a]);
         }
         int out_ = solve(a);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }

	static int solve(int[] arr){
       // Write your code here
       Arrays.sort(arr);
       int n = arr.length;
       if(n % 2 == 0)
       {
           return (arr[(n - 1)/2] + arr[n/2]) / 2;
       }
       return arr[n/2];
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[] twoSum(int[] A, int target) {
       // Your code here
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0;i < A.length;i++)
       {
           int newtarget = target - A[i];
           if(map.containsKey(newtarget))
           {
               return new int[]{map.get(newtarget) + 1,i + 1};
           }
           map.put(A[i],i);
       }
       return new int[]{};
    }
	
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int)n];
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
	}
}

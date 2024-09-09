import java.util.*;

class Solution {
    public void allDuplicates(int n, int[] arr) {
        // Write Your code here.
        HashMap<Integer,Integer> st = new HashMap<>();
        for(int i = 0;i < arr.length;i++)
        {
            if(st.containsKey(arr[i]))
            {
                int t = st.get(arr[i]);
                t++;
                st.put(arr[i],t);
            }else{
                st.put(arr[i],1);
            }
        }
        for(int i:st.keySet())
        {
            if(st.get(i) > 1)
              System.out.print(i +" ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.allDuplicates(n, arr);
        sc.close();
    }
}

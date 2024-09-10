import java.io.*;
import java.util.*;

class Solution {
    public static int longestUniqueSubsttr(String str)
    {
        // Your code here
        int n=str.length();
        int res=0;
        for(int i=0;i<n;i++){
            boolean[] visited = new boolean[256];
            for(int j=i;j<n;j++){
                if(visited[str.charAt(j)]){
                    break;
                }else{
                    res=Math.max(res,j-i+1);
                    visited[str.charAt(j)]=true;
                }
            }
        }
        return res;
    }
}

public class Main {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution obj = new Solution();
        int len = obj.longestUniqueSubsttr(str);
        System.out.println(len);
    }
}

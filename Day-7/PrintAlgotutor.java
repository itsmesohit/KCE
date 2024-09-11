import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        solve("ALGOTUTOR",n);
    }

    public static void solve(String s,int n){
        //write your code here
       if(n == 0)
         return;
        System.out.println(s);
        solve(s,n - 1);
    }
}

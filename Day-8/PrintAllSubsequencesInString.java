import java.util.*;
import java.util.Scanner;

public class Main{
    static void printAllSubsequence(String s) {
        //Write your code here
        printsub(s,"",0);
    }
    static void printsub(String s,String curr,int index)
    {
        if(index == s.length())
        {
            if(curr.length() == 0)
            {
                return;
            }else{
                System.out.print(curr +" ");
                return;
            }
        }
        printsub(s,curr+s.charAt(index),index + 1);
        printsub(s,curr,index + 1);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printAllSubsequence(str);
    }
}

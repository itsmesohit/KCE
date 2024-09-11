import java.util.*;
import java.io.*;

class Solution{
    static int solve(int a,int b){
        //Write code here
      ArrayList<Integer> li = new ArrayList<>();
      for(int i = 1;i <= a;i++){
        li.add(i);
      }
      return answer(li,b - 1,0);
    }
    static int answer(ArrayList<Integer> li,int b,int index)
    {
        if(li.size() == 1)
        {
          return li.get(0);
        }
         index = (index + b) % li.size();
         li.remove(index);
         return answer(li,b,index);
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Solution.solve(a,b));
    }
}

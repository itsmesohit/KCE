import java.io.*;
import java.util.*;

public class Main {
    public static int multiplyRecursively(int a, int b) {
         if(b == 1)
         {
             return a;
         }
         return a + multiplyRecursively(a,b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = multiplyRecursively(a, b);
        System.out.println(c);
    }
}

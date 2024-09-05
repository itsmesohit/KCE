import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();  // Corrected method from `nextIntO` to `nextInt()`
        
        // Write your code here
        if (year >= 1900 && year % 4 == 0) {  // Corrected assignment operator `=` to comparison `==`
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

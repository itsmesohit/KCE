import java.util.Scanner;

class Solution {
    public void duplicates(int[] arr) {
        // Nested loops to check for duplicates (O(n^2) complexity)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("true");
                    return;  // Exit once a duplicate is found
                }
            }
        }
        // If no duplicates are found
        System.out.println("false");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Size of the array
        int[] arr = new int[n];
        
        // Input the array elements
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        
        // Create an instance of the Solution class and call the duplicates method
        Solution Obj = new Solution();
        Obj.duplicates(arr);
        
        sc.close();  // Close the scanner
    }
}

import java.util.Scanner;

class Solution {
    public void printAllElements(int[][] arr, int n, int m) {
        // Loop through the 2D array and print each element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of rows (n) and columns (m)
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Create a 2D array
        int[][] arr = new int[n][m];

        // Input elements into the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Create an instance of Solution and print the 2D array elements
        Solution Obj = new Solution();
        Obj.printAllElements(arr, n, m);

        sc.close();  // Close the scanner
    }
}

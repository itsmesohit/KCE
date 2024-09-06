import java.io.*;
import java.util.*;

class Solution {
    public void rotateMatrixBy90(int [][]mat, int row, int col) {
        //write your code here 
        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<row;i++){
            int first=0;
            int last=col-1;
            while(first<last){
                int temp=mat[i][first];
                mat[i][first]=mat[i][last];
                mat[i][last]=temp;
                first++;
                last--;
                
            }
        }
    
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int [][]mat = new int[n][m];
        
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        Solution Obj = new Solution();
        Obj.rotateMatrixBy90(mat, n, m);
        
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

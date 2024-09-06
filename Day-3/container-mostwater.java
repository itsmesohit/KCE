import java.util.*;

class Solution {
    public int maxArea(int[] heights) {
        //Write code here
        int left=0,right=heights.length-1;
        int area=-1;
        while(left<right){
            area=Math.max(area,(Math.min(heights[left],heights[right])*(right-left)));
            if(heights[left]<heights[right]){
                left++;
            }
            else if(heights[left]>=heights[right]){
                right--;
            }
        }
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.maxArea(arr);
        System.out.println(result);
        sc.close();
    }
}

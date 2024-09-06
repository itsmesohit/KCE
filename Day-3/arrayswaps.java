import java.io.*;
import java.util.*;

public class Main {
    static String arraySwaps(int arr[],int n,int x)
    {
        // Your code here
        
 for(int i=0;i<arr.length-1;i++){
     if(Math.abs(arr[i]-arr[i+1])>=x){
         int temp=arr[i];
             arr[i]=arr[i+1];
             arr[i+1]=arr[i];
             
         
     }
 }
     for(int i=0;i<arr.length-1;i++){
     if(arr[i]<arr[i+1]){
         return "YES";
     }
     }

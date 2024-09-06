import java.util.*;
public class Main {
    public static void main(String[] args) {
       // write your code here   
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
		    sum+=i;
		}
		System.out.println(sum);
    }

}

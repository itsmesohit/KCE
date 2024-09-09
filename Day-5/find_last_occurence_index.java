import java.util.Scanner;

class Main {

    static int findLastIndex(int arr[],int A,int startIndex)
    {
        //write your code here
        for(int i = startIndex;i >= 0;i--)
        {
            if(arr[i] == A)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = s.nextInt();
        }

        int T = s.nextInt();
        System.out.println(findLastIndex(A, T, N-1));
    }

}

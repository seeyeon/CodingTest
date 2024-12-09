import java.util.Scanner;

public class Main {

    public static final int MAX_N = 100;

    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            rangeSum(a1,a2);
        }
    }

    public static void rangeSum(int a, int b){
        int sum=0;

         for(int i=a-1; i<=b-1; i++){
            sum +=arr[i];    
         }

         System.out.println(sum);
    }
}
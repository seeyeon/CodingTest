import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){ 
            arr[i] = sc.nextInt();
        }

        func(arr, m);

    }

    public static void func(int[] arr, int m){
        int sum=0;

        while(m!=1){    

            if(m%2==0){
                sum +=arr[m-1];
                m /=2;
            }else{
                sum +=arr[m-1];
                m -=1;
            }
        }

        sum +=arr[0];

        System.out.print(sum);
    }
}
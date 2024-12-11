import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(facSum(N));
    }

    public static int facSum(int n){

        if(n%2!=0){
            //1부터 N까지의 홀수의 합
            if(n==1)
                return 1;

            return facSum(n-2)+n;

        }else{
            //2부터 N까지의 짝수의 합
            if(n==2)
                return 2;

            return facSum(n-2)+n;
        }   
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++){
            if(func(i))
                cnt++;
        }

        System.out.print(cnt);
    }

    public static boolean func(int n){
        int num1 = n / 10; //십의 자리
        int num2 = n %10; //일의 자리

        int sum = num1 + num2;

        if(isPrime(n) && sum%2==0){
            return true;
        }
        return false;
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }

        return true;
    }

}
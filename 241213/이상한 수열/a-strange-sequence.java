import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(fun(n));
    }

    public static int fun(int n){

        if(n==1)
            return 1;

        if(n==2)
            return 2;

        
        return fun(n/3)+fun(n-1);



    }
}
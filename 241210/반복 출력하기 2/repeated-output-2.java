import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        helloPrint(N);
    }

    public static void helloPrint(int n){


        if(n==0){
            return;
        }

        helloPrint(n-1);
        System.out.println("HelloWorld");


    }
}
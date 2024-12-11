import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int result =1; 

        for(int i=0; i<3; i++){
            result *=sc.nextInt();    
        }

        System.out.print(funcSum(result));

    }

    public static int funcSum(int n){

        if(n<10){
            return n;
        }

        return funcSum(n/10) + n%10;

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        cal(a,b);
        //System.out.print(a+" "+b);
    }

    public static void cal(int a, int b){

        if(a>b){
            a +=25;
            b *=2; 
        }else{
            a *=2;
            b +=25;
        }

        System.out.print(a+" "+b);

    }
}
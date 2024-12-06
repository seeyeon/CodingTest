import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char oper = sc.next().charAt(0);
        int b = sc.nextInt();

        if(oper =='+'){
            System.out.print(a+" + " + b + " = " + plus(a,b));
        }else if(oper == '-'){
            System.out.print(a+" - " + b + " = " + minus(a,b));
        }else if(oper == '*'){
            System.out.print(a+" * " + b + " = " + multiply(a,b));
        }else if(oper == '/'){
            System.out.print(a+" / " + b + " = " + divide(a,b));
        }else{
            System.out.print("False");
        }
        
    }

    public static int plus(int a, int b){
        return a+b;
    }

    public static int minus(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int divide(int a, int b){
        return a/b;
    }
}
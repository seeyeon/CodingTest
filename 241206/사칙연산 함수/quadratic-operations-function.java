import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String oper = sc.next();
        String num2 = sc.next();

        int result = fun(num1, oper, num2);

        if(result !=0){
            System.out.print(num1+" "+oper+" "+num2+" = "+result);
        }else{
            System.out.print("False");
        }
    }

    public static int fun(String num1, String oper, String num2){
        
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        
        if(oper.equals("+")){
            return a+b ; 
        }else if(oper.equals("-")){
            return a-b;
        }else if(oper.equals("/")){
            return (int)a/b;
        }else if(oper.equals("*")){
            return a*b;
        }else{
            return 0;
        }
    
    }
}
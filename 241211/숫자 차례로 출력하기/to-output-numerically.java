import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        numberPrint(n);
        System.out.println(" ");
        numberPrintReverse(n);
    }

    public static void numberPrint(int n){
        
        if(n==0){
            return;
        }
        
        numberPrint(n-1);
        System.out.print(n+" ");
    }

     public static void numberPrintReverse(int n){
        
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        numberPrintReverse(n-1);
    }
}
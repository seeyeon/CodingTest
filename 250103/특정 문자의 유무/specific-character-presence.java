import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(str.contains("ee")){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
        System.out.print(" ");

        if(str.contains("ab")){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}
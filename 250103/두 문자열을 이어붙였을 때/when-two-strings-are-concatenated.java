import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String AB = A+B;
        String BA = B+A;

        if(AB.equals(BA)){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}
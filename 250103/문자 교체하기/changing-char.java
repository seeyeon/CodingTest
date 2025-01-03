import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();

        String front = strA.substring(0,2);
        String tail = strB.substring(2);
        
        String result = front + tail;

        System.out.print(result);
        
    }
}
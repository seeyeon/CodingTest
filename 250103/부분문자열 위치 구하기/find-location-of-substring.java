import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String ch = sc.next();

        System.out.print(str.indexOf(ch));
    }
}
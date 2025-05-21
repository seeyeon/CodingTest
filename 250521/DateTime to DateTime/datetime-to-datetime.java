import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        if(A<11){
            System.out.print("-1");
            return;
        }

        int day = (A-11)*24*60;
        int hour = (B-11)*60;
        int min = (C-11);

        int result = day+hour+min;

        System.out.print(result);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
         String[] week = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int day1 = 0;
        for(int i = 1; i < m1; i++) day1 += days[i];
            day1 += d1;

        int day2 = 0;
        for(int i = 1; i < m2; i++) day2 += days[i];
        day2 += d2;

        int diff = day2 - day1;
        int count = (diff+1)/7;
        System.out.println(count+1);
    }
}
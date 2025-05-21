import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        String[] week = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDay = 0;

        if(m1==m2 && d2==d1){
            System.out.print("Mon");
            return;
        }else if(m1 ==m2 && d2 < d1){
            totalDay +=(d2-d1)+1;
        }else{
            totalDay += days[m1] -d1;
            totalDay += days[m2] -d2;

            for(int i=m1+1; i<=m2-1; i++){
                totalDay += days[i];
            }
        }

        int cal = (totalDay % 7);
        String calWeek = week[cal];

        System.out.print(calWeek); 

    }
}
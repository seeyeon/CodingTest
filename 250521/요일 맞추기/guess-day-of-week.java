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
        int totalDays = 0;

        if(m1==m2){
            totalDays += d2 - d1;
        }else if(m2<m1){
            totalDays +=days[m2]-d2;
            for(int i=m2+1; i<m1; i++){
                totalDays +=days[i];
            }
            totalDays +=d1;
            totalDays = -totalDays
        }else{
            totalDays += days[m1] -d1;
            for(int i=m1+1; i<m2; i++){
                totalDays +=days[i];
            }
            totalDays += d2;
        }

        long cal = (1+totalDays) %7;
        String calWeek = week[cal];

        System.out.println(calWeek);
    }
}
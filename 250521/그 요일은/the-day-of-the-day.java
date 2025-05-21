import java.util.Scanner;

public class Main {

    public static int numOfDays(int m , int d){
         int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         int totalDays = 0;

         for(int i=1; i<m; i++){
            totalDays +=days[i];
         }

         totalDays +=d;

         return totalDays;

    }

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
        
        int startDate = numOfDays(m1, d1);
        int endDate = numOfDays(m2, d2);

        int index =0;
        for(int i=0; i<week.length; i++){
            if(week[i].equals(A)){
                index = i;
                break;
            }
        }
        
        int count = 0;
        int totalDays = endDate - startDate;
        for (int i = 0; i <= totalDays; i++) {
            int currentDayIndex = (1 + i) % 7; //1은 기준 요일(월요일) 
            if (currentDayIndex == index) count++;
        }

        System.out.print(count);
    }
}
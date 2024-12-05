import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        int maxDay = getMaxDay(M);

         if(M<=12 && D<=maxDay){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static int getMaxDay(int month){
        if(month == 2) return 28;
        if(month == 4 || month == 6 || month == 9 || month == 11) return 30;
        return 31;
    }

    


}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int y= sc.nextInt();

        System.out.println(isYear(y));
    }

    public static boolean isYear(int y){
        
        if(y%100==0 && y%400!=0)
            return false;

        if(y%4==0)
            return true;

        return false;
    }
}
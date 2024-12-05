import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt(); 

       
        maxDays(year, month);
        String season = Season(month);

        if(isPresent(year, month, day)){
            System.out.print(season);
        }else{
            System.out.print("-1");
        }

        //System.out.print(season);
    }

     public static boolean isPresent(int year, int month, int day){

        if(year<=3000 && day <=maxDays(year,month)){
            return true;
        }

        else return false;

     }


     public static int maxDays(int year, int month){

        if(month==4 || month==6 || month==9 || month==11 ) return 30;
        
        if(month ==2){
            if(year%4 ==0 ) return 29;
            if(year%4 ==0 && year%100 ==0) return 28;
            if((year%4 ==0 && year%100 ==0) && year%400 ==0) return 29;
            else return 28;
        }

        else return 31;
     }


     public static String Season(int month){
        if(month >=3 && month <=5) return "Spring";
        if(month >=6 && month <=8) return "Summer";
        if(month >=9 && month <=11) return "Fall";
        if(month ==12 || (month >=1 && month <=2)) return "Winter";

        else return "-1";
     }

}
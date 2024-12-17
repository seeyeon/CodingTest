import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

class Climate{

    String date;
    String day;
    String Weather;

    public Climate(String date, String day, String Weather){
        this.date = date;
        this.day = day;
        this.Weather = Weather;
    }


}


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Climate[] climate = new Climate[n];

        //입력값 받기
        for(int i=0; i<n; i++){
            String date = sc.next();
            String day = sc.next();
            String Weather = sc.next();

            climate[i] = new Climate(date, day, Weather);
        }

        //날짜를 기준으로 오름차순
        Arrays.sort(climate, Comparator.comparing(p->p.date));

        int rain=0;

        for(int i=0; i<n; i++){
            if(climate[i].Weather.equals("Rain")){
                rain = i;
                break;
            }
        }


        System.out.print(climate[rain].date+" "+climate[rain].day+" "+
        climate[rain].Weather);




    }
}
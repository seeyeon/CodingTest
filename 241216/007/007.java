import java.util.Scanner;

class Mission{

    String secretCode;
    char place;
    int time;

    public Mission(String secretCode, char place, int time){
        this.secretCode = secretCode;
        this.place = place;
        this.time=time;
    }

}




public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String secretCode=sc.next();
        char place = sc.next().charAt(0);
        int time = sc.nextInt();

        Mission mission = new Mission(secretCode,place,time);

        System.out.println("secret code : " + mission.secretCode);
        System.out.println("meeting point : "+ mission.place);
        System.out.println("time : "+ mission.time);


    }
}
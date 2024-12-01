import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = func(a,b);

        System.out.print(result);
    }

    public static int func(int a, int b){
       
        int cnt=0;
        int result = 1;

        while(cnt<b){
            result *=a;
            cnt++;
        }

        return result;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt =0;

        for(int i=a; i<=b; i++){
            if(isMagicNumber(i))
                cnt++;
        }

        System.out.print(cnt);

    }
    
    public static boolean isMagicNumber(int n){
        if(n%3==0){
            return true;
        }

        if((n/10)%3==0){
            return true;
        }

        if((n%10)%3==0){
            return true;
        }

        return false;

     }
    
}
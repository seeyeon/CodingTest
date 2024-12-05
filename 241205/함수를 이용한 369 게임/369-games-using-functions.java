import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count =0;

        for(int i=a; i<=b;  i++){
            if(isThree(i)){
                count++;
            }
        } System.out.print(count);
        
    }

    public static boolean isThree(int n){

            if(n%3==0) return true;
            if((n/10)%3==0) return true;
            if((n%10)%3==0) return true;
       
            else return false;
    }
}
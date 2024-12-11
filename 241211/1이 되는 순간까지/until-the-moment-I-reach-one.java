import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(numberCnt(N));
    }

    public static int numberCnt(int n){
        int cnt=0;
        
      while(n>1){
        
        if(n%2==0){
            n = n/2;
            cnt++;
        }else {
            n = n/3;
            cnt++;
        }

      }

        return cnt;

    }
}
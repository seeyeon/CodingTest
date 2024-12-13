import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(fun(n,0));
    }

    public static int fun(int n, int cnt){
       
       if(n==1){
            return cnt;
       }

       if(n%2==0){
            return fun(n/2, cnt+1);
       }else{
            return fun(n*3+1, cnt+1);
       }
        
    }

}
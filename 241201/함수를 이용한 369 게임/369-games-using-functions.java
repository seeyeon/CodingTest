import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt =0;

        int num1 = three(a,b);
        int num2 = contains(a,b);
        int num3 = common(a,b); 

        System.out.print((num1+num2)-num3);

    }
    
    public static int three(int a, int b){
        int cnt=0;

        for(int i=a; i<=b; i++){
            if(i%3==0){
               cnt++;
            }
        }
        return cnt;

    }

    public static int contains(int a, int b){
        int cnt=0;
        for(int i=a; i<=b; i++){
            if(i%10==3 || i%10==6 || i%10==9 || i/10==3 || i/10 ==6 || i/10==9){
               cnt++;
            }
        }
        return cnt;
    }

    public static int common(int a, int b){
        int cnt=0;
        for(int i=a; i<=b; i++){
            if(i%3==0 && (i%10==3 || i%10==6 || i%10==9 || i/10==3 || i/10 ==6 || i/10==9) ){
               cnt++;
            }
        }
        return cnt;
    }
}
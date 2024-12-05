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

            //1. 3의 배수인경우
            if(n%3==0) return true;
            
            //2. 3,6,9중 하나라도 포함하는 경우
            while(n>0){
                int digit = n%10;
                if(digit ==3 || digit == 6 || digit ==9){
                    return true;
                }
                n = n/10;
            }

       
            return false;
    }
}
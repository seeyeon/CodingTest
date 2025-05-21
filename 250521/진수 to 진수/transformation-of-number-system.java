import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();  //첫번쨰 진수
        int B = sc.nextInt();  //바꿔야하는 진수
        String N = sc.next();  //주어진 값
        // Please write your code here.

        int num = 0;

        for(int i=0; i<N.length(); i++){
            num = num * A + (N.charAt(i) - '0');
        }

        int[] digit = new int[20];
        int cnt=0;

        while(true){
            if(num<B){
                digit[cnt++] = num;
                break;
            }

            digit[cnt++] = num % B;
            num /=B;
        }

        for(int i=cnt-1; i>=0; i--){
            System.out.print(digit[i]);
        }
    }
}
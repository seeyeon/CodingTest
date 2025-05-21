import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int num =0;

        for(int i=0; i<binary.length(); i++){
            num = num * 2 + (binary.charAt(i) - '0'); //십진수로 바꾸기
        }

        num *=17;

        int[] digit = new int[20];
        int cnt = 0;

        while(true){
            if(num<2){
                digit[cnt++] = num;
                break;
            }

            digit[cnt++] = num %2;
            num /=2;
        }

        for(int i=cnt-1; i>=0; i--){
            System.out.print(digit[i]);
        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        cal(A);
    }

    public static void cal(String a){
        int cnt=0;

        for(int i=0; i<a.length()-1; i++){
            if(a.charAt(i) !=a.charAt(i+1)){
                cnt++;
            }
        }

        if(cnt>=2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }




    }
}
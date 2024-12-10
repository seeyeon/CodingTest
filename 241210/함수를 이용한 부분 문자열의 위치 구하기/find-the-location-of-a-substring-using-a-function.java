import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String input  = sc.next();
        String str = sc.next();

        isPresent(input, str);
    }

    public static void isPresent(String A, String str){

        for(int i=0; i<A.length(); i++){

        }

        if(!A.contains(str)){
            System.out.print("-1");
        }else{
           System.out.print(A.indexOf(str));
        }




    }
}
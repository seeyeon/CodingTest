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

        boolean found = false;

        for(int i=0; i<=A.length() - str.length(); i++){
            boolean match =true;

            for(int j=0; j<str.length(); j++){
                if(A.charAt(i+j) != str.charAt(j)){
                    match = false;
                    break;
                }
            }


            if(match){
                System.out.print(i);
                found =true;
                break;
            }
        }

        if(!found){
            System.out.print("-1");
        }

    }
}
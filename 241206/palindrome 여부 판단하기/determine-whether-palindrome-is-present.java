import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        if(isPalindrome(A)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }

    public static boolean isPalindrome(String A){
        
        int i = 0;
        int j = A.length() -1;

        while(i<j){
            if(A.charAt(i) != A.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        
        return true;


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);
        int result = str.indexOf(ch);

        if(result != -1){
            System.out.print(result);
        }else{
            System.out.print("No");
        }
        
    }
}
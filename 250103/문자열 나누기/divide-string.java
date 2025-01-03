import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "";

        for(int i=0; i<n; i++){
            str += sc.next();
        }

        int len = str.length();

        for(int i=0; i<len; i+=5){
            String part = str.substring(i, Math.min(i+5, len));
            System.out.println(part);
        }

        
    }
}
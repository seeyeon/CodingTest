import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();
        char[] arr = str.toCharArray();

        arr[1]='a';
        arr[len-2] ='a';
        
        for(int i=0; i<len; i++){
            System.out.print(arr[i]);
        }
    }
}

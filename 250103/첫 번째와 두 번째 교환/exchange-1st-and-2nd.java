import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();

        char first = str.charAt(0);
        char second = str.charAt(1);

        for(int i=0; i<str.length(); i++){
            if(arr[i] == first){
                arr[i] = second;
            }else if(arr[i] ==second){
                arr[i] = first;
            }
        }

        for(int i=0; i<str.length(); i++){
            System.out.print(arr[i]);
        }
        
    }
}
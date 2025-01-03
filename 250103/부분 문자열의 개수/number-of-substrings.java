import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String strA = sc.next();
        String strB = sc.next();
        int cnt=0;

        for(int i=0; i<strA.length()-1; i++){
            if((strA.charAt(i) +""+ strA.charAt(i+1)).equals(strB)){
                cnt++;
            }
        }

        System.out.print(cnt);
        
    }
}
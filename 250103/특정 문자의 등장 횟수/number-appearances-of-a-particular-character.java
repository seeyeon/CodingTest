import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt = 0, cnt2=0;

        String str = sc.next();
       

        for(int i=0; i<str.length()-1; i++){
            if((str.charAt(i) +""+str.charAt(i+1)).equals("ee")){
                cnt++;
            }else if((str.charAt(i) +""+str.charAt(i+1)).equals("eb")){
                cnt2++;
            }

        }

        System.out.print(cnt+" "+cnt2);
        
    }
}
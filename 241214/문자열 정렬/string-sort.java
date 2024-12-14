import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] chararr = str.toCharArray();

        Arrays.sort(chararr);

        String str2 = new String(chararr);

        System.out.print(str2);
    }
}
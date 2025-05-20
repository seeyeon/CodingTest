import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.


        int[] num_of_days = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};

        int first = 0, second =0;

        if(m1==m2 && d1==d2){
            System.out.print("1");
            return;
        }

        for(int i=0; i<=m2; i++){
            second +=num_of_days[i];
        }

        for(int j=0; j<=m1; j++){
            first +=num_of_days[j];
        }

        int result = second - first;
        result = d2+d1-1;
        System.out.println(result);
    }
}
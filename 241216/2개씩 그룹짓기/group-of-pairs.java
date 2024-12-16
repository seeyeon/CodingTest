import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();   
        int k = n*2;
        int[] arr = new int[k];

        for(int i=0; i<k; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = arr[k-2]+arr[1];

        System.out.print(max);
    }
}
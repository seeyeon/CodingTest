import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] cleaned = new int[N+1];
        
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int j=A; j<=B; j++){
            cleaned[j] += 1;
            }
        }
        // Please write your code here.
        int max = cleaned[0];

        for(int i=0; i<cleaned.length; i++){
            if(max < cleaned[i]){
                max = cleaned[i];
            }
        }

        System.out.print(max);
    }
}
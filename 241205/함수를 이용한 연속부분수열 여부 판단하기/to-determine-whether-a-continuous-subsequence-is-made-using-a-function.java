import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] A = new int[n1];
        int[] B = new int[n2];

        for(int i=0; i<n1; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<n2; i++){
            B[i] = sc.nextInt();
        }

        if(isSubsequance(A,B,n1,n2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }


    public static boolean isSubsequance(int[] A, int[] B, int n1, int n2){
        //A의 탐색 범위
        for(int i=0; i<=n1-n2; i++) {
            boolean match = true;
            for(int j=0; j<n2; j++){
                if(A[i+j] != B[j]){
                match = false;
                break;
                }
            }

            if(match){
                return true;
            }
        }

        return false;  
    }
}
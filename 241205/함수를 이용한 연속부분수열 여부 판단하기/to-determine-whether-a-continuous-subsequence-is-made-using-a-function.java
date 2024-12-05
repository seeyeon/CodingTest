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


        if(isFunc(A,B)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean isFunc(int[] A, int[] B){

       
        if(A.length < B.length){
            return false;
        }

         // 슬라이딩 윈도우 방식으로 A에서 B와 같은 부분 배열이 있는지 확인
        for (int i = 0; i <= A.length - B.length; i++) {
            boolean isMatch = true;

            // A의 현재 윈도우와 B 비교
            for (int j = 0; j < B.length; j++) {
                if (A[i + j] != B[j]) {
                    isMatch = false;
                    break;
                }
            }

            // 부분 배열이 일치하면 true 반환
            if (isMatch) {
                return true;
            }
        }

        // 끝까지 찾지 못했으면 false 반환
        return false;

    }
}
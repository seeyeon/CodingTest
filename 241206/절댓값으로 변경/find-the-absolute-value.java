import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];    


        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        isAbsolute(arr); //값을 반환하지 않는다.. return;

        for(int i=0; i<N; i++){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void isAbsolute(int[] arr){

        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                arr[i] *=-1;
            }
        }



        return ;
    }
}
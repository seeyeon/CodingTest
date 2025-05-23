import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] checked = new int[100];//100으로 두는게 맞나? 메모리 낭비?
        for(int i=0; i<n; i++){
            for(int j=x1[i]; j<=x2[i]-1; j++){
                checked[j] +=1;
            }
        }

        //chcked에서 최댓값
        int max=0;
        for(int i=0; i<checked.length; i++){
            if(max < checked[i]){
                max = checked[i];
            }
        }

        System.out.print(max);
    }
}
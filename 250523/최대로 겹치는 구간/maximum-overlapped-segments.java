import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

            minX = Math.min(minX, Math.min(x1[i], x2[i]));
            maxX = Math.max(maxX, Math.max(x1[i], x2[i]));
        }
        // Please write your code here.
        int offset = minX <0 ? -minX : 0;

        int[] checked = new int[maxX+offset+2]; 
        for(int i=0; i<n; i++){
            for(int j=x1[i]; j<=x2[i]-1; j++){
                checked[j+offset] +=1;
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
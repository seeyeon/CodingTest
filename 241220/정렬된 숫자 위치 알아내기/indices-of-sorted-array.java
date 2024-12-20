import java.util.Scanner;
import java.util.Arrays;

class Num implements Comparable<Num>{
    int number;
    int index;

    public Num(int number, int index){
        this.number = number;
        this.index = index;
    }

    @Override
    public int compareTo(Num num){
        //num은 오름차순
        if(this.number != num.number)
            return this.number - num.number;

        //인덱스도 오름차순
        return this.index - num.index;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int numCache;
        int[] answer = new int[n];  //정답을 담을 배열

        Num[] num = new Num[n]; //정렬할 배열

        for(int i=0; i<n; i++){
            numCache = sc.nextInt();
            num[i] = new Num(numCache, i);
        }

        Arrays.sort(num);

        for(int i=0; i<n; i++){
            answer[num[i].index] = i+1;
        }

        for(int i=0; i<n; i++){
            System.out.print(answer[i]+" ");
        }
    }
}
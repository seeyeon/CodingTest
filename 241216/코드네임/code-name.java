import java.util.Scanner;

class Spy{

    String codeName;
    int score;

    public Spy(String codeName,int score){
        this.codeName = codeName;
        this.score = score;
    }
};

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        Spy[] spy = new Spy[5];

        for(int i=0; i<5; i++){
            String codeName = sc.next();
            int score = sc.nextInt();

            spy[i] = new Spy(codeName, score); 
        }

        int minIndex =0;

        for(int i=0; i<5; i++){
            if(spy[i].score < spy[minIndex].score){
                minIndex = i;
            }
        }

        System.out.print(spy[minIndex].codeName+" "+spy[minIndex].score);        
    }
}


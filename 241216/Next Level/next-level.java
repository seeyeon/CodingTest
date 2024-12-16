import java.util.Scanner;

class Game{
    
    String userId;
    int level;
    
    public Game(String userId,int level){
        this.userId = userId;
        this.level = level;
    }

    public Game(){
        this.userId = "codetree";
        this.level = 10;
    }
}


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String userId = sc.next();
        int level =  sc.nextInt();

        Game game1 = new Game(userId, level);
        Game game2 = new Game();

        System.out.println("user "+game2.userId+ " lv "+ game2.level);
        System.out.println("user "+game1.userId+ " lv "+ game1.level);
    }
}
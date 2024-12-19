import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point>{
    int dist;
    int index;

    public Point(int dist, int index){
        this.dist = dist;
        this.index = index;
    }

    @Override
    public int compareTo(Point point){
        //거리는 오름차순
        if(dist !=point.dist)
            return this.dist - point.dist;

        //인덱스도 오름차순
        return this.index - point.index;
    }


}

public class Main {

    public static int getDist(int x, int y){
        return Math.abs(x) + Math.abs(y);
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Point[] point = new Point[n];

        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();

            point[i] = new Point(getDist(x,y), i+1);
        }

        Arrays.sort(point);

        for(int i=0; i<n; i++){
            System.out.println(point[i].index);
        }
        
    }
}
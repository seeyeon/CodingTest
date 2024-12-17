import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


class Person{
    String name;
    int height, weight;

    Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] person = new Person[n];

        for(int i=0; i<n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            person[i] = new Person(name,height,weight);
        }

        Arrays.sort(person, Comparator.comparing(p->Integer.valueOf(p.height)));

        for(int i=0; i<n; i++){
            System.out.println(person[i].name + " "+person[i].height+" "+person[i].weight);
        }
    }
}
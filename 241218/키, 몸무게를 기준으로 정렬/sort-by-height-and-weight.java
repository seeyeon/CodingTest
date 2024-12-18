import java.util.Scanner;
import java.util.Arrays;

class Person implements Comparable<Person>{
    String name;
    int h,w;

    public Person(String name, int h, int w){
        this.name = name;
        this.h=h;
        this.w=w;
    }

    @Override
    public int compareTo(Person person){
        //키는 오름차순
        if( this.h != person.h)
            return this.h - person.h;

        //몸무게는 내림차순
        return person.w - this.w;
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
            int h = sc.nextInt();
            int w = sc.nextInt();

            person[i] = new Person(name, h, w);
        }

        Arrays.sort(person);

        for(int i=0; i<n; i++){
            System.out.println(person[i].name+" "+person[i].h+" "+person[i].w);
        }

    }
}
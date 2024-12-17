import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Person{
    String name, phone, address;

    Person(String name, String phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] person = new Person[n];

        //입력값 저장
        for(int i=0; i<n; i++){
            String name = sc.next();
            String phone = sc.next();
            String address = sc.next();

            person[i] = new Person(name, phone, address);
        }

        Arrays.sort(person, Comparator.comparing(p->p.name));

        //정렬 된 마지막 이름이 제일 느린 이름임
        Person slowestPerson = person[n-1];


        System.out.println("name " + slowestPerson.name);
        System.out.println("addr " + slowestPerson.phone);
        System.out.println("city " + slowestPerson.address);


    }
}
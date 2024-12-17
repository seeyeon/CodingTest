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

        int lastPerson =0;
        for(int i=1; i<n; i++){
            if(person[i].name.compareTo(person[lastPerson].name)>0){
                lastPerson=i;
            }
        }
        

        System.out.println("name " + person[lastPerson].name);
        System.out.println("addr " + person[lastPerson].phone);
        System.out.println("city " + person[lastPerson].address);


    }
}
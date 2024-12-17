import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student  {
    String name;
    int h;
    double w;

    public Student(String name, int h, double w){
        this.name = name;
        this.h = h;
        this.w = w;
    }

    // @Override
    // public int compareTo(Student student){

    //         return this.h - student.h;
    // }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc= new Scanner(System.in);

        Student[] student = new Student[5];

        for(int i=0; i<5; i++){
            String name = sc.next();
            int h=sc.nextInt();
            double w=sc.nextDouble();

            student[i] = new Student(name, h,w);
        }


        Arrays.sort(student, Comparator.comparing(p->p.name));

        System.out.println("name");
         for(int i=0; i<5; i++){
            System.out.print(student[i].name+" ");
            System.out.print(student[i].h+" ");
            System.out.printf("%.1f",student[i].w);
            System.out.println(" ");
        }System.out.println(" ");

        Arrays.sort(student, Comparator.comparingInt((Student p)-> p.h).reversed());

        System.out.println("height");
        for(int i=0; i<5; i++){
            System.out.print(student[i].name+" ");
            System.out.print(student[i].h+" ");
            System.out.printf("%.1f",student[i].w);
            System.out.println(" ");
        }



        // Arrays.sort(student);

        // System.out.println("heignt");
        // for(int i=0; i<5; i++){
        //     System.out.print(student[i].name);
        //     System.out.print(student[i].h);
        //     System.out.printf("%1.f",student[i].w);
        // }


    }
}
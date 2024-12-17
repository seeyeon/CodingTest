import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{

    String name;
    int sub1, sub2, sub3;

    public Student(String name, int sub1, int sub2, int sub3){
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    public int compareTo(Student student){
        //낮은 순(오름차순)
        return (this.sub1+this.sub2+this.sub3) - (student.sub1+student.sub2+student.sub3);
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] student = new Student[n];

        for(int i=0; i<n; i++){
            String name = sc.next();
            int sub1 = sc.nextInt();
            int sub2 = sc.nextInt();
            int sub3 = sc.nextInt();

            student[i] = new Student(name, sub1, sub2, sub3);
        }

        Arrays.sort(student);

        for(int i=0; i<n; i++){
            System.out.println(student[i].name+" "+student[i].sub1+" "+student[i].sub2+" "+student[i].sub3);
        }


    }
}
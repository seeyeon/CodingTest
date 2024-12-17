import java.util.Scanner;
import java.util.Arrays;


class Student implements Comparable<Student>{
    int h,w,num;

    public Student(int h, int w, int num){
        this.h = h;
        this.w = w;
        this.num = num;
    }

    @Override
    public int compareTo(Student student){
        if(this.h != student.h)
            return this.h-student.h;
        
        if(this.w != student.w)
            return this.w-student.w;
        
        return student.num -  this.num ;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] student = new Student[n];

        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int num = (i+1);

            student[i] = new Student(h,w,num);
        }

        Arrays.sort(student);

        for(int i=n-1; i>=0; i--){
            System.out.println(student[i].h+" "+student[i].w+" "+student[i].num);
        }
    }
}
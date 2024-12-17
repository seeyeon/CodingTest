import java.util.Scanner;
import java.util.Arrays;

class Subject implements Comparable<Subject> {
    String name;
    int kor, eng, math;

    Subject(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Subject subject) {
        // 1. 국어 점수 내림차순
        if (this.kor != subject.kor) {
            return subject.kor - this.kor;
        }
        // 2. 영어 점수 오름차순
        if (this.eng != subject.eng) {
            return subject.eng - this.eng;
        }
        // 3. 수학 점수 내림차순
        return subject.math - this.math;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Subject[] subject = new Subject[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            subject[i] = new Subject(name,kor, eng, math);
        }

        Arrays.sort(subject);

        for (int i = 0; i < n; i++) {
            System.out.println(subject[i].name+" "+subject[i].kor + " " + subject[i].eng + " " + subject[i].math);
        }
    }
}

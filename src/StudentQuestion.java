import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        sc.nextLine();
        for(int i = 0; i<n;i++){
            String all = sc.nextLine();
            String[] objects = all.split(" ");
            Student student = new Student(objects[0],
                    Integer.parseInt(objects[1]),
                    Integer.parseInt(objects[2]),
                    Integer.parseInt(objects[3]));
            student.total = student.math+ student.chinese+ student.english;
            students[i] = student;
        }
        Arrays.sort(students,new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.total > student2.total) return -1;
                else if(student1.total<student2.total) return 1;
                else {
                    if(student1.chinese > student2.chinese) return -1;
                    else if(student1.chinese<student2.chinese) return 1;
                    else {
                        if (student1.math > student2.math) return -1;
                        else if (student1.math < student2.math) return 1;
                        else return student1.name.compareTo(student2.name);
                    }
                }
            }
        });
        int rank = 1;
        System.out.println("rank:"+rank+" "+students[0]);
        for(int i=1;i<n;i++){
            if(students[i].chinese == students[i-1].chinese &&
               students[i].math == students[i-1].math &&
               students[i].english == students[i-1].english){
            }else {
                rank = i+1;
            }
            System.out.println("rank:"+rank+" "+students[i]);
        }
    }

}

class Student{
        String name;
        int chinese;
        int math;
        int english;
        int total;

        public Student(String name, int chinese, int math, int english) {
            this.name = name;
            this.chinese = chinese;
            this.math = math;
            this.english = english;
        }

    @Override
    public String toString() {
        return "name:" + name +" total:" +total+ " chinese:" +chinese
                + " math:"+math+" english:"+english;
    }
}
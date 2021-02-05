import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Lecture lecture = new Lecture();
        List<Double>student1Grades = new ArrayList<>();
        List<Double>student2Grades = new ArrayList<>();
        List<Double>student3Grades = new ArrayList<>();
        student1Grades.add(45.4);
        student1Grades.add(80.5);
        student1Grades.add(50.0);
        student2Grades.add(90.4);
        student2Grades.add(80.5);
        student2Grades.add(60.0);
        student3Grades.add(70.4);
        student3Grades.add(55.5);
        student3Grades.add(65.0);


        NaughtyStudent naughtyStudent1 = new NaughtyStudent(student1Grades);
        NaughtyStudent naughtyStudent2 = new NaughtyStudent(student2Grades);
        NaughtyStudent naughtyStudent3 = new NaughtyStudent(student3Grades);

//        Student student1 = new Student(student1Grades);
//        Student student2 = new Student(student2Grades);
//        Student student3 = new Student(student3Grades);
//        System.out.println("naughty student grades");
//        lecture.enter(naughtyStudent1);
//        lecture.enter(naughtyStudent2);
//        lecture.enter(naughtyStudent3);
//        System.out.println(lecture.studentsGrades);

//        System.out.println("normal student grades");
//        lecture.enter(student1);
//        lecture.enter(student2);
//        lecture.enter(student3);
//        System.out.println(lecture.studentsGrades);
    }
}

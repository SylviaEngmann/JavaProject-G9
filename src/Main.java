import com.group9.enums.Level;
import com.group9.lecture.Lecture;
import com.group9.register.Register;
import com.group9.student.NaughtyStudent;
import com.group9.student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Lecture lecture = new Lecture();
        List<Double>student1Grades = new ArrayList<>();
        List<Double>student2Grades = new ArrayList<>();
        List<Double>student3Grades = new ArrayList<>();
        List<Double>student4Grades = new ArrayList<>();

        student1Grades.add(45.4);
        student1Grades.add(80.5);
        student1Grades.add(50.0);
        student2Grades.add(90.4);
        student2Grades.add(80.5);
        student2Grades.add(60.0);
        student3Grades.add(70.4);
        student3Grades.add(55.5);
        student3Grades.add(65.0);
        student4Grades.add(65.0);



        NaughtyStudent naughtyStudent1 = new NaughtyStudent(student1Grades, Level.LEVEL100,"eee");
        NaughtyStudent naughtyStudent2 = new NaughtyStudent(student2Grades,Level.LEVEL300,"bbb");
        NaughtyStudent naughtyStudent3 = new NaughtyStudent(student3Grades,Level.LEVEL400,"AAA");

        Student student1 = new Student(student1Grades,Level.LEVEL100,"Ama" );
        Student student2 = new Student(student2Grades, Level.LEVEL100, "Kojo");
        Student student3 = new Student(student3Grades, Level.LEVEL200, "Esi");
        Student student4 = new Student(student4Grades, Level.LEVEL400, "Ama");




        List<Student>allStudents = new ArrayList<>();
        List<NaughtyStudent>allNaughtyStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student4);
        allStudents.add(student2);
        allStudents.add(student3);

        //naughty students
        allNaughtyStudents.add(naughtyStudent1);
        allNaughtyStudents.add(naughtyStudent2);
        allNaughtyStudents.add(naughtyStudent3);
        Register<NaughtyStudent> register = new Register(allNaughtyStudents);
        Register<Student>register1 = new Register(allStudents);

        System.out.println(register1.findStudentsByName(Arrays.asList("Ama","Esi")));





    }
}

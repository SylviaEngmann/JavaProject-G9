package Tests;

import com.group9.register.Register;
import com.group9.student.Student;
import com.group9.student.StudentNotFoundException;
import com.group9.enums.Level;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    Register register;

    @BeforeEach
    public  void setUp(){

        List<Double>student1Grades = new ArrayList<>();
        List<Double>student2Grades = new ArrayList<>();

        student1Grades.add(45.4);
        student1Grades.add(80.5);
        student1Grades.add(50.0);
        student2Grades.add(90.4);
        student2Grades.add(80.5);
        student2Grades.add(60.0);

        Student student1 = new Student(student1Grades,Level.LEVEL200,"fred");
        Student student2 = new Student(student2Grades,Level.LEVEL300,"kofi");

        List<Student>allStudents = new ArrayList<>();

        allStudents.add(student1);
        allStudents.add(student2);
        register = new Register(allStudents);
    }


    @Test
    void shouldThrowStudentNotFoundException() {

        //Register register = new Register(allStudents);

        Assertions.assertThrows(StudentNotFoundException.class,()->{
            register.getStudentByName("ama");
        });
    }
}
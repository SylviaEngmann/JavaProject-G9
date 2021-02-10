package Tests;

import com.group9.register.Register;
import com.group9.student.NaughtyStudent;
import com.group9.student.Student;
import com.group9.enums.Level;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class NaughtyStudentTest {
    Student naughtyStudent;
    Student student;

    @BeforeEach
    void setUp(){
        List<Double> student1Grades = new ArrayList<>(Arrays.asList(50.5,75.6,60.5,50.0));

         naughtyStudent = new NaughtyStudent(student1Grades, Level.LEVEL100,"kofi");
         student = new Student(student1Grades, Level.LEVEL100,"kofi");


    }

    @Test
    void testNaughtystudentAverageGreaterThanStudentAverage(){
        Assertions.assertNotEquals(student.getAverageGrade(),naughtyStudent.getAverageGrade());
    }

    @Test
    void testNaughtystudentIsKindOfStudent() {
        //complete this test
        Assertions.assertEquals(naughtyStudent.getGrades(),student.getGrades());
    }
}
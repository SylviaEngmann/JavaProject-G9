package Tests;

import com.group9.student.NaughtyStudent;
import com.group9.student.Student;
import com.group9.enums.Level;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void TestNaughtystudentIsKindOfStudent() {
        List<Double> student1Grades = new ArrayList<>();

        NaughtyStudent naughtyStudent = new NaughtyStudent(student1Grades, Level.LEVEL100,"kofi");

       // com.group9.student.Student student = new com.group9.student.Student();

        //assertEquals(student, naughtyStudent);
        assertTrue(naughtyStudent instanceof Student);



    }
}
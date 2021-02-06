import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void TestNaughtystudentIsKindOfStudent() {
        List<Double> student1Grades = new ArrayList<>();
        String name = "YYY";
        Level level = Level.LEVEL200;
        NaughtyStudent naughtyStudent = new NaughtyStudent(student1Grades,level, name);

       // Student student = new Student();

        //assertEquals(student, naughtyStudent);
        assertTrue(naughtyStudent instanceof Student);



    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
@Test
    void TestAverageGradeEqualsDouble() {

//        double sum=20;
//        int num_grades=5;
//        double average=sum/num_grades;
//
//        assertEquals(4, average);
        Student student = new Student();
        assertNotNull(student.getAverageGrade());
    }
}
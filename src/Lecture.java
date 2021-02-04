import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

    List<Double> studentsGrades = new ArrayList<>();

    public void enter (Student student){
        studentsGrades.add(student.getAverageGrade());
    }

    public double getHighestAverageGrade (){
        Collections.sort(studentsGrades);
        return studentsGrades.get(studentsGrades.size()-1);
    }
}

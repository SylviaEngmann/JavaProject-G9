import java.util.HashMap;
import java.util.Map;

public class BagOfStudents {
    Map<Student, Student> students = new HashMap<>();

    public void addStudent (Student student) {
        this.students.put(student,student);
    }

    public void removeStudent (Student student){
        this.students.remove(student);
    }

    public void removeAllStudents(){
        students.clear();
    }
}

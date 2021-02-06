import java.util.List;

public class NaughtyStudent extends Student{
    public NaughtyStudent(List<Double> grades, Level level, String name){
        super(grades, level, name);
    }
    public double getAverageGrade() {
        double sum = 0;
        double average;
        int num_grades = grades.size();
        for(int i = 0; i <num_grades; i++){
            sum += grades.get(i);
        }
        average = sum/num_grades;
        average += 0.10* average;

        return average;
    }
}

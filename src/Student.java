import java.util.List;

public class Student {

    public List<Double> grades;

    public Student (){

    }

    public Student (List<Double> grades){
        this.grades = grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        double average;
        int num_grades = grades.size();
        for(int i = 0; i <num_grades; i++){
            sum += grades.get(i);
        }
        average = sum/num_grades;
        return average;
    }
}

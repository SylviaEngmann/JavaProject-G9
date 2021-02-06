import java.util.List;

public class Student implements Nameable, HasLevel {

    public List<Double> grades;
    private String name;
    private  Level level;


    public Student (){

    }

    public Student (List<Double> grades, Level level, String name){
        this.grades = grades;
        this.level =level;
        this.name = name;
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


    public String getName() {
        return this.name;
    }

    public Level getLevel(){
        return level;
    }
}

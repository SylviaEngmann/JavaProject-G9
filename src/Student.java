import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Student implements Nameable, HasLevel {

    private List<Double> grades;
    private String name;
    private  Level level;


    public Student (){

    }

    public Student (List<Double> grades, Level level, String name){
        this.grades = grades;
        this.level =level;
        this.name =name;
    }

    @Override
    public String toString() {
        return "{" +
                "grades=" + grades +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    public double getAverageGrade() {
//        double sum = 0;
        double average;
//        int num_grades = grades.size();
//        for(int i = 0; i <num_grades; i++){
//            sum += grades.get(i);
//        }
//        average = sum/num_grades;
        DoubleStream stream = this.getGradesAsStream(); //this.grades.stream().mapToDouble(Double::doubleValue);
         average = stream.average().getAsDouble();
        return average;
    }


    public String getName() {
        return this.name;
    }

    public Level getLevel(){
        return level;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public DoubleStream getGradesAsStream(){
       DoubleStream stream =  this.grades.stream().mapToDouble(Double::doubleValue);
       return stream;
    }

}

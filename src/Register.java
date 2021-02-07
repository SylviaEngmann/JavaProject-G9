

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Register<T> {
    List<Student>students;
    public  Register(List<Student>students){

        this.students = students;
    }


    public List<Student> getRegister(){
//        List<String>names = new ArrayList<>();
//
//        for (var student:this.students){
//            names.add(student.getName());
//        }
//
//        return names;

        // Higher order collection methods using the stream abstraction
        List<Student> allStudentNames = this.students.stream().collect(Collectors.toList());

        return allStudentNames;
    }

    public Map<Level,List<Student>>getRegisterByLevel(Level level){
//        Map<Level,List<Student>>studentsByLevel = new HashMap<>();
//        List<Student>studentList = new ArrayList<>();
//        for (var student:this.students){
//            if(student.getLevel()==level)
//                    studentList.add(student);
//        }
//        studentsByLevel.put(level,studentList);
//        return studentsByLevel;
        Map<Level,List<Student>>studentsByLevel = this.students.stream()
                .filter(student -> student.getLevel().equals(level)).collect(Collectors.groupingBy(Student::getLevel));

        return  studentsByLevel;

    }

    public void sortStudent(){
         //Collections.sort(this.students,studentComparator);
         List<Student>sortedStudent= this.students.stream()
                 .sorted(Comparator.comparing(student->student.getName() ))
                 .collect(Collectors.toList());
         sortedStudent.forEach(System.out::println);

    }

    public List<Student>getStudentByName(String name) throws StudentNotFoundException {
        List<Student> names = this.students.stream().filter(student -> student.getName().equals(name))
                .collect(Collectors.toList());

        if (names.isEmpty())
            throw new StudentNotFoundException(name);
        return names;
    }

        public Optional<Student> StudentByName (List <String> names) {
            List<Student> namess = this.students.stream().filter(student -> student.getName().equals(names))
                    .collect(Collectors.toList());

            return Optional.ofNullable(namess);

        }


//    public List<Double> getHighestGrade(){
//       List<Double>grades = this.students.stream().forEach(student -> student.getGrades())
//
//
//    }

        public List<Double> findAverage () {

            DoubleStream grades = this.students.stream().mapToDouble(Student::getAverageGrade);
            List<Double> averageGrades = new ArrayList<>();
            grades.forEach(student -> averageGrades.add(student));
            return averageGrades;

        }
//TODO:Complete getGradesAbove60
        public void getGradesAbove60 () {
            List<Student> grades = this.students;
            grades.forEach(item -> System.out.println(item.getGrades()));
        }



            public void printReport () {
                for (var student : this.students) {
                    System.out.println(student.getName() + " " + student.getLevel());
                }
            }
}


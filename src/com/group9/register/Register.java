package com.group9.register;

import com.group9.student.Student;
import com.group9.student.StudentNotFoundException;
import com.group9.enums.Level;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Register<T extends Student> {
    List<T>students;
    public  Register(List<T>students){

        this.students = students;
    }

    // returns all students
    public List<Student> getRegister(){

        return this.students.stream().collect(Collectors.toList());


    }

    //returns filtered students by given level
    public Map<Level,List<Student>>getRegisterByLevel(Level level){

        return this.students.stream()
                .filter(student -> student.getLevel().equals(level)).collect(Collectors.groupingBy(Student::getLevel));



    }

    // returns sorted students by given parameter
    public List<Student> sortStudent(Comparator<Student>student){
         //Collections.sort(this.students,studentComparator);
         return this.students.stream()
                 .sorted(student)
                 .collect(Collectors.toList());


    }

    //throws com.group9.student.StudentNotFoundException if no student found
    public List<Student>getStudentByName(String name) throws StudentNotFoundException {
        List<Student> names = this.students.stream().filter(student -> student.getName().equals(name))
                .collect(Collectors.toList());

        if (names.isEmpty())
            throw new StudentNotFoundException(name);
        return names;
    }

        // returns filtered students by given name
        public Optional<List<Student>> studentByName (String names) {
        return Optional.ofNullable(this.students.stream().filter(student -> student.getName().equals(names))
                    .collect(Collectors.toList()));


        }



    //returns students  find in a list of names
        public List<Student> findStudentsByName(List<String>names) {

           return this.students.stream().map(student->{
                List<Student>filteredStudent = new ArrayList<>();
                names.stream().forEach(name->{
                    if(student.getName().equals(name))
                        filteredStudent.add(student);

                });
                return filteredStudent;
            }).flatMap(Collection::stream).collect(Collectors.toList());

        }

    //returns highest grade of all students grade
    public double getHighestGrade(){
       return this.students.stream().map(student->student.getGrades()).flatMap(Collection::stream)
               .mapToDouble(Double::doubleValue).max().getAsDouble();

    }

        // returns averages of students
        public List<Double> findAverage () {

        return this.students.stream().map(Student::getAverageGrade).collect(Collectors.toList());



        }

        // returns students grades with average over 60
        public List<Student> getGradesAbove60 () {

            return this.students.stream().filter(item->item.getAverageGrade()>60.0)
                    .collect(Collectors.toList());

        }



        // returns students group by their levels
            public void printReport () {


                 this.students.stream()
                        .sorted(Comparator.comparing(Student::getLevel))
                        .forEach(student-> System.out.printf(student.getName()+" "+student.getLevel()));



            }


}


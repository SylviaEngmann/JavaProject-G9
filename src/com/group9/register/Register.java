package com.group9.register;

import com.group9.student.Student;
import com.group9.student.StudentNotFoundException;
import com.group9.enums.Level;

import java.util.*;
import java.util.stream.Collectors;

public class Register<T> {
    List<Student>students;
    public  Register(List<Student>students){

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
    public List<Student> sortStudent(){
         //Collections.sort(this.students,studentComparator);
         return this.students.stream()
                 .sorted(Comparator.comparing(student->student.getName() ))
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



    //TODO complete findStudentByName method

//        public List<com.group9.student.Student> findStudentsByName(List<String>names) {
//            List<com.group9.student.Student> studs = new ArrayList<>();
//            names.stream().map((item) -> {
//                List<com.group9.student.Student> stds = this.students.stream().filter((student -> student.getName().equals(item)))
//                        .collect(Collectors.toList());
//
//                return studs.add(stds.contains(item));
//            });
//
//
//            return studs;
//        }

    //TODO:complete getHighestGrade method
//    public List<Double> getHighestGrade(){
//       List<Double>grades = this.students.stream().forEach(student -> student.getGrades())
//
//
//    }

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
            public Map<Level,List<Student>> printReport () {


                return this.students.stream()
                        .sorted(Comparator.comparing(student -> student.getLevel()))
                        .collect(Collectors.groupingBy(Student::getLevel));



            }

//    public  List<Student> getStudentsByName (List<String> listOfNames){
//        if(!students.isEmpty()){
//            for(String name: listOfNames){
//
//                for(Student s:students){
//                    if (name.equals(s.getName())){
//                        // name match found
//
//                    }
//                }
//            }
//        }
//
//
//    }
}


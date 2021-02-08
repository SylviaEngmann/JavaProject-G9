package com.group9.register;

import com.group9.student.Student;
import com.group9.student.StudentNotFoundException;
import com.group9.enums.Level;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Register<T> {
    List<Student>students;
    public  Register(List<Student>students){

        this.students = students;
    }

    // returns all students
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

    //returns filtered students by given level
    public Map<Level,List<Student>>getRegisterByLevel(Level level){
//        Map<com.group9.enums.Level,List<com.group9.student.Student>>studentsByLevel = new HashMap<>();
//        List<com.group9.student.Student>studentList = new ArrayList<>();
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

    // returns sorted students by given parameter
    public List<Student> sortStudent(){
         //Collections.sort(this.students,studentComparator);
         List<Student>sortedStudent= this.students.stream()
                 .sorted(Comparator.comparing(student->student.getName() ))
                 .collect(Collectors.toList());
         return sortedStudent;
         //sortedStudent.forEach(System.out::println);

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
            List<Student>studentNames = this.students.stream().filter(student -> student.getName().equals(names))
                    .collect(Collectors.toList());
            Optional<List<Student>>studs = Optional.ofNullable(studentNames);

            return studs;

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
            DoubleStream grades = this.students.stream().mapToDouble(Student::getAverageGrade);
            List<Double> averageGrades = new ArrayList<>();
            grades.forEach(averageGrades::add);
            return averageGrades;

        }

        // returns students grades with average over 60
        public List<Student> getGradesAbove60 () {
//           Map<Boolean,List<com.group9.student.Student>> studentsAbovedo = this.students.stream()
//                   .collect(Collectors.partitioningBy(item->item.getAverageGrade()>60.0,Collectors.));
//           return studentsAbovedo;
            List<Student>studs = this.students.stream().filter(item->item.getAverageGrade()>60.0)
                    .collect(Collectors.toList());
            return studs;

        }



        // returns students group by their levels
            public Map<Level,List<Student>> printReport () {
//
//
                Map<Level,List<Student>>studentGroupByLevel = this.students.stream()
                        .sorted(Comparator.comparing(student -> student.getLevel()))
                        .collect(Collectors.groupingBy(Student::getLevel));

//
                return studentGroupByLevel;
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


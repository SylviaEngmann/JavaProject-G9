package com.group9.lecture;

import com.group9.student.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

    List<Student> students = new ArrayList<>();

    public void enter (Student student){
        students.add(student);
    }

    public double getHighestAverageGrade (){

        return this.students.stream().map(Student::getAverageGrade).max(Double::compareTo).get();
    }

}

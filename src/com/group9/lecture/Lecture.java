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
        List<Double> studentsGrades = new ArrayList<>();
        for (var student:this.students){
            studentsGrades.add(student.getAverageGrade());
        }
        Collections.sort(studentsGrades);
        return studentsGrades.get(studentsGrades.size()-1);
    }

}

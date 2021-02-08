package com.group9.student;

import com.group9.enums.Level;
import com.group9.student.Student;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> grades, Level level, String name){


        super(grades, level, name);

    }

//    public NaughtyStudent(List<Double> student2Grades, Level level300, String bbb) {
//    }

    public double getAverageGrade() {
        double sum = 0;
        double average;
        int num_grades = getGrades().size();
        for(int i = 0; i <num_grades; i++){
            sum += getGrades().get(i);
        }
        average = sum/num_grades;
        average += 0.10* average;

        return average;
    }
}

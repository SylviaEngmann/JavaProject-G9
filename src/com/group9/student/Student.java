package com.group9.student;
import com.group9.interfaces.HasLevel;
import com.group9.interfaces.Nameable;
import com.group9.enums.Level;

import java.util.List;

import java.util.stream.Stream;

public class Student implements Nameable, HasLevel {

    private List<Double> grades;
    private String name;
    private Level level;


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

        return this.getGradesAsStream().mapToDouble(Double::doubleValue).average().getAsDouble();

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

    public Stream<Double> getGradesAsStream(){
        return this.grades.stream();

    }

}

package com.group9.student;

import com.group9.enums.Level;


import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> grades, Level level, String name){


        super(grades, level, name);

    }



    public double getAverageGrade() {
        return super.getAverageGrade()+(super.getAverageGrade()*0.10);

    }
}

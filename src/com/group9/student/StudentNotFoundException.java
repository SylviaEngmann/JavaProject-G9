package com.group9.student;

import java.util.function.Supplier;

public class StudentNotFoundException extends Exception{
    private String param;
    public StudentNotFoundException(String param){
        this.param = param;

    }

    public String getParam(){
        return this.param;
    }


}

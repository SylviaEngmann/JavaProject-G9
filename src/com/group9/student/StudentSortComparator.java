package com.group9.student;

import com.group9.student.Student;

import java.util.Comparator;

public class StudentSortComparator implements Comparator<Student> {


    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}

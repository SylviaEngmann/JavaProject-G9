package com.group9.lecture;

import com.group9.student.Student;

import java.util.HashMap;
import java.util.Map;

public class BagOfLectures {
    Map<Lecture, Lecture> lectures = new HashMap<>();

    public void addLecture (Lecture lecture) {
        this.lectures.put(lecture,lecture);
    }

    public void removeLecture (Student student){
        this.lectures.remove(student);
    }

    public void removeAllLectures(){
        lectures.clear();
    }
}

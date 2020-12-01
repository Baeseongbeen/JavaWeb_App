package com.example.myjavaweb;

public class Student {
    private String _name, _course;

    public Student(String name, String course) {
        this._name = name;
        this._course = course;
    }

    public String getName() {
        return _name;
    }

    public String getCourse() {
        return _course;
    }
}

package com.design.creational.builder;

public class Student {
    String name;
    int age;
    int regNo;

    public Student(StudentBuilder studentBuilder){
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.regNo = studentBuilder.regId;
    }
}

package com.design.creational.builder;

public class StudentBuilder {
    String name;
    int age;
    int regId;

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public StudentBuilder setRegId(int id){
        this.regId = id;
        return this;
    }

    public Student build(){
        return new Student(this);
    }

}

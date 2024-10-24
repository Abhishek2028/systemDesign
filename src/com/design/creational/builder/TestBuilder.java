package com.design.creational.builder;

public class TestBuilder {
    public static void main(String args[]){
        StudentBuilder builder = new StudentBuilder();
        Student s1 = builder.setAge(20).setName("Abhishek").setRegId(123).setName("Kaki").build();
        System.out.println(s1.name);
    }
}

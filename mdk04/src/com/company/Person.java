package com.company;

public class Person {
    String FullName;
    int Age;

    Person(int age, String name) {
        Age = age;
        FullName = name;}
    Person() {
        FullName = null;
        Age = 0;
    }
    public void PersonTalk(){

        System.out.println("�����-�� " + FullName + " �������");

    }
    public void PersonMove(){

        System.out.println("�����-�� " + FullName + " �������");

    }
}
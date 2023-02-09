package com.company;
public class PersonDemo {
    public static void main( String[] args ) {
        Person person1 = new Person(21, "Игнат");
        Person person2 = new Person();

        person2.PersonTalk();
        person2.PersonMove();
        person1.PersonTalk();
        person1.PersonMove();
    }
}


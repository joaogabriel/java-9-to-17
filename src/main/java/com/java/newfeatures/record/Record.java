package com.java.newfeatures.record;

import com.java.newfeatures.record.model.Person;

public class Record {

    public static void main(String[] args) {
        Person person = new Person("John", 10, "1000 Street");
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println("Address: " + person.address());
    }

}

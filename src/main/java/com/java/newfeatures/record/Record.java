package com.java.newfeatures.record;

import com.java.newfeatures.record.model.Person;
import com.java.newfeatures.record.model.PersonOld;

public class Record {

    public static void main(String[] args) {

        // with records
        Person person = new Person("John", 10, "1000 Street");
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println("Address: " + person.address());

        // without records
        PersonOld personOld = new PersonOld("John", 10, "1000 Street");
        System.out.println("Name: " + personOld.getName());
        System.out.println("Age: " + personOld.getAge());
        System.out.println("Address: " + personOld.getAddress());

    }

}

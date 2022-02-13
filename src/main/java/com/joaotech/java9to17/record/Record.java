package com.joaotech.java9to17.record;

import com.joaotech.java9to17.record.model.Person;
import com.joaotech.java9to17.record.model.PersonOld;

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

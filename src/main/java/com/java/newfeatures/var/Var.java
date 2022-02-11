package com.java.newfeatures.var;

import com.java.newfeatures.var.model.Car;

public class Var {

    public static void main(String[] args) {

        // string
        var name = "Ana";
        System.out.println(name);

        // integer
        var age = 75;
        System.out.println(age);

        // object
        var car = new Car();
        car.setBrand("BMW");
        car.setModel("320i");
        System.out.println(car);

        // sim, isto funciona!
        var var = "var";

        // mas isto não funciona!
//        var language = null;

        // isto também não!
//        var language;
    }

}

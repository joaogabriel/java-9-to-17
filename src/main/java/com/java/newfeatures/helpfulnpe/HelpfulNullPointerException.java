package com.java.newfeatures.helpfulnpe;

import com.java.newfeatures.helpfulnpe.model.Address;
import com.java.newfeatures.helpfulnpe.model.Developer;
import com.java.newfeatures.helpfulnpe.model.Manager;
import com.java.newfeatures.helpfulnpe.model.Squad;

public class HelpfulNullPointerException {

    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setSquad(new Squad());
        developer.getSquad().setManager(new Manager());

        Address address = developer.getSquad().getManager().getAddress();

        // null pointer exception aqui
        System.out.println(address.getLabel());
    }

}

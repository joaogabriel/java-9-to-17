package com.joaotech.java9to17.helpfulnpe;

import com.joaotech.java9to17.helpfulnpe.model.Address;
import com.joaotech.java9to17.helpfulnpe.model.Developer;
import com.joaotech.java9to17.helpfulnpe.model.Manager;
import com.joaotech.java9to17.helpfulnpe.model.Squad;

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

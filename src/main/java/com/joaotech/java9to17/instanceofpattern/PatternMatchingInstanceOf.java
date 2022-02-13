package com.joaotech.java9to17.instanceofpattern;

import com.joaotech.java9to17.instanceofpattern.model.Door;
import com.joaotech.java9to17.instanceofpattern.model.Window;

public class PatternMatchingInstanceOf {

    public static void main(String[] args) {

        // door
        checkObject(new Door());

        // window
        checkObject(new Window());

    }

    private static void checkObject(Object genericObject) {
        if (genericObject instanceof Door door) {
            door.open();
        } else if (genericObject instanceof Window window) {
            window.close();
        }
    }

}

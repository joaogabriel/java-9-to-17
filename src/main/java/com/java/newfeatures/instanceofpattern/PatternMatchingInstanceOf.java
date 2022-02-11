package com.java.newfeatures.instanceofpattern;

import com.java.newfeatures.instanceofpattern.model.Door;
import com.java.newfeatures.instanceofpattern.model.Window;

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

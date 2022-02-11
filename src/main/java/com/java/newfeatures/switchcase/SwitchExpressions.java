package com.java.newfeatures.switchcase;

public class SwitchExpressions {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(8));

    }

    private static boolean isEvenNumber(Integer number) {
        return switch (number) {
            case 2, 4, 6, 8, 10 -> true;
            default -> false;
        };
    }

}

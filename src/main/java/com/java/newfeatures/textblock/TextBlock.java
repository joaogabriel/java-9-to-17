package com.java.newfeatures.textblock;

public class TextBlock {

    public static void main(String[] args) {

        // with text block
        System.out.println(getQueryWithTextBlock());

        // without text block
        System.out.println(getQueryWithoutTextBlock());

    }

    private static String getQueryWithTextBlock() {
        return """
                SELECT *
                FROM TABLE
                WHERE COLUMN = VALUE;
                """;
    }

    private static String getQueryWithoutTextBlock() {
        return " SELECT * " +
                "FROM TABLE " +
                "WHERE COLUMN = VALUE;";
    }

}

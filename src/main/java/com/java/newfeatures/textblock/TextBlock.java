package com.java.newfeatures.textblock;

public class TextBlock {

    public String test() {
        return """
                SELECT *
                FROM TABLE
                WHERE COLUMN = VALUE;
                """;
    }

}

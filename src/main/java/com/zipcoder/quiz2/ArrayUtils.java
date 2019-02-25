package com.zipcoder.quiz2;

public class ArrayUtils {
    public static String getSecondElement(String[] values) {

        return values[2];
    }

    public static String getLastElement(String[] values) {

        int length = values.length;
        return values [length - 1];
    }

    public static String[] updateLastElement(String[] values, String carlton) {

        int length = values.length;
        values[length - 1] = "Carlton";

        return values;
    }
}
package com.zipcoder.quiz2;

public class ArrayUtils {
    public static String getSecondElement(String[] values) {
        return values[1];
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] updateLastElement(String[] values, String carlton) {
        int lastIndex = values.length - 1;
        values[lastIndex] = carlton;

        return values;
    }
}
package com.zipcoder.quiz2;

public class ArrayUtils {
    public static String getSecondElement(String[] values) {

        return values[1];
    }

    public static String getLastElement(String[] values) {

        return values[values.length -1];
    }

    public static String[] updateLastElement(String[] values, String carlton) {

        values[values.length-1] = carlton;


        return values;
    }
}
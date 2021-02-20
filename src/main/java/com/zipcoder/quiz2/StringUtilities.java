package com.zipcoder.quiz2;


import java.util.ArrayList;

public class StringUtilities {

    /**
     * Checks if the value passed in is null. If it is null, return false, otherwise,
     * return true
     *
     * @param str string to check
     * @return return false if str is null, true otherwise
     */
    public static Boolean isNotNull(String str) {
        if (str != null) {
            return true;
        } else {
            return false;
           }

    }

    /**
     * Given a string, return the first and last characters of the string
     * in another string
     *
     * @param value
     * @return return the first and last character in a string
     */
    public static String firstAndLast(String value) {

    String str = "";
    str = str + value.charAt(0);
    str = str + value.charAt(value.length()-1);
        return str;

    }

    /**
     * Update the oldChar with the new character. For example, given
     * "apple" and old char is 'a' and new character is 'z' then the
     * method should return "zpple"
     *
     * @param value
     * @param oldChar
     * @param newChar
     * @return
     */
    public static String change(String value, char oldChar, char newChar) {

        return value.replace(oldChar, newChar);
    }

    /**
     * Given a string, separate each by the exclamation point. For example, given
     * "this!is!a!string test", then this method should return the array
     * {"this", "is", "a", "string test"}
     *
     * @param value
     * @return
     */
    public static String[] separateByExaclamation(String value) {

        return value.split("!");
    }
}

package com.zipcoder.quiz2;


public class StringUtilities {

    /**
     * Checks if the value passed in is null. If it is null, return false, otherwise,
     * return true
     *
     * @param str string to check
     * @return return false if str is null, true otherwise
     */
    public static Boolean isNotNull(String str) {

        String str;
        if((str.length() == 1) && (str.charAt(0) == null)) {
        return false; }

        if((str.charAt(str.length() - 1) == null) && ((str.charAt(1) != null))) {
            return false; }

        if((str.charAt(0) == null) && ((str.charAt(1) != null))) {
            return false; }

            for(int i = 1; i < str.length() - 1; i++) {
                if(str.charAt(1) == null) {
                    if((str.charAt(i + 1) != null) && (str.charAt(i - 1) != null)) {
                        return false;}}}
            return true;
    }

    /**
     * Given a string, return the first and last characters of the string
     * in another string
     *
     * @param value
     * @return return the first and last character in a string
     */
    public static String firstAndLast(String value) {

        String result = "";

        char first = value.charAt(0);
        char last = value.charAt(value.length() - 1)
        result = first + last;

        return result;
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
        return null;
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
        return null;
    }
}

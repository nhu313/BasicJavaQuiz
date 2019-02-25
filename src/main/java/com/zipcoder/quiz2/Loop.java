package com.zipcoder.quiz2;

public class Loop {

    /**
     * Given a character, return a string with the character repeated n times
     * For example, given charToRepeat is 'a' and numberOfTime is 3, then the return
     * String is the letter a repeated 3 times "aaa"
     *
     * @param charToRepeat
     * @param numberOfTime number of time to repeat the character
     * @return the string with the letter repeated n times
     */
    public static String repeat(char charToRepeat, int numberOfTime) {

        if (numberOfTime <= 0) return "";
        else if (numberOfTime % 2 == 0) return repeat((char) (charToRepeat+charToRepeat), numberOfTime/2);

              else
            return charToRepeat + repeat((char) (charToRepeat+charToRepeat), numberOfTime/2);


    }













    /**
     * Given two integer, add from the start number up to, but not including the stop.
     * For example, given start is 2 and stop is 5. The method should add 2 + 3 + 4 which
     * will return 9.
     *
     * @param start the number to start
     * @param stop the number to stop
     * @return the total from start to stop
     */
    public static int addUpTo(int start, int stop) {
        return 0;
    }
}

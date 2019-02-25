package com.zipcoder.quiz2;

public class ArrayLoop {


    /**
     * Multiply each number in the array by 3. For example, given an array
     * {3, 1, 8} then calling method will return an array of
     * {9, 3, 24}
     *
     * @param numbers to multiply
     * @return return an array with each number multiply by 3
     */
    public static int[] multiplyByThree(int[] numbers) {

        int [] result = new int [numbers.length];
        for (int i = 1; i < result.length; i ++) {
        result [i] = result[i] * 3;
        }
        return result;
    }


    /**
     * Count how many times a value appears in the array. For example, given the values as
     * {"the", "apple", "is", "the", "fruit"} and valueToCount as "the", then the
     * method will return 2 because the word "the" appears twice in the array
     *
     * @param values of String
     * @param valueToCount
     * @return return the number of times the valueToCount appears in the array
     */
    public static Integer count(String[] values, String valueToCount) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == valueToCount) {
                count++;
            } else {
                count = count;
            }
        return count;
    }
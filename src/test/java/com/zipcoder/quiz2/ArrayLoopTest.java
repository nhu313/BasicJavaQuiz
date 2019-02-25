package com.zipcoder.quiz2;

import org.junit.Assert;
import org.junit.Test;

public class ArrayLoopTest {

    @Test
    public void testMultiplyByThree_withSmallArray(){
        //Given
        int[] numbers = new int[]{4, 2, 9};
        int[] expected = new int[]{12, 6, 27};

        //When
        int[] actual = ArrayLoop.multiplyByThree(numbers);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMultiplyByThree_withBigArray(){
        //Given
        int[] numbers = new int[]{3, 9, 1, 3, 7};
        int[] expected = new int[]{9, 27, 3, 9, 21};

        //When
        int[] actual = ArrayLoop.multiplyByThree(numbers);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCount() {
        //Given
        String[] values = new String[]{"when", "in", "doubt", "blame", "will"};
        int expected = 1;

        //When
        int actual = ArrayLoop.count(values, "in");

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount_multipleTimes() {
        //Given
        String[] values = new String[]{"when", "in", "when", "when", "will"};
        int expected = 3;

        //When
        int actual = ArrayLoop.count(values, "when");

        //Then
        Assert.assertEquals(expected, actual);
    }
}

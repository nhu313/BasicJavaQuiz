package com.zipcoder.quiz2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilsTest {

    @Test
    public void getSecondElement() {
        //Given
        String[] values = new String[]{"when", "in", "doubt", "blame", "will"};
        String expected = "in";

        //When
        String actual = ArrayUtils.getSecondElement(values);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondElement_forShortArray() {
        //Given
        String[] values = new String[]{"when", "doubt", "blame"};
        String expected = "doubt";

        //When
        String actual = ArrayUtils.getSecondElement(values);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastElement() {
        //Given
        String[] values = new String[]{"when", "in", "doubt", "blame", "will"};
        String expected = "will";

        //When
        String actual = ArrayUtils.getLastElement(values);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastElement_forShortArray() {
        //Given
        String[] values = new String[]{"when", "doubt", "blame"};
        String expected = "blame";

        //When
        String actual = ArrayUtils.getLastElement(values);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updateLastElement() {
        //Given
        String[] values = new String[]{"when", "in", "doubt", "blame", "will"};
        String[] expected = new String[]{"when", "in", "doubt", "blame", "carlton"};

        //When
        String[] actual = ArrayUtils.updateLastElement(values, "carlton");

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void updateLastElement_forShortArray() {
        //Given
        String[] values = new String[]{"blame", "uncle"};
        String[] expected = new String[]{"blame", "minion"};

        //When
        String[] actual = ArrayUtils.updateLastElement(values, "minion");

        //Then
        Assert.assertArrayEquals(expected, actual);
    }
}
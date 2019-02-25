package com.zipcoder.quiz2;

import org.junit.Assert;
import org.junit.Test;

public class LoopTest {

    @Test
    public void testRepeatSmall(){
        //Given
        String expected = "aaaa";

        //When
        String actual = Loop.repeat('a', 4);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRepeatBig(){
        //Given
        String expected = "oooooooooo";

        //When
        String actual = Loop.repeat('o', 10);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddUpToSmall(){
        //Given
        int expected = 9;

        //When
        int actual = Loop.addUpTo(2, 5);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddUpToLarge(){
        //Given
        int expected = 45;

        //When
        int actual = Loop.addUpTo(1, 10);

        //Then
        Assert.assertEquals(expected, actual);
    }
}

package com.zipcoder.quiz2;

import com.zipcoder.quiz2.StringUtilities;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class StringUtilitiesTest {

    @Test
    public void testIsNotNull_whenIsNull() {
        //Given
        Boolean expected = false;

        //When
        Boolean actual = StringUtilities.isNotNull(null);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsNotNull_whenIsEmptyString() {
        //Given
        Boolean expected = true;

        //When
        Boolean actual = StringUtilities.isNotNull("");

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstAndLast(){
        //Given
        String value = "world";
        String expected = "wd";

        //When
        String actual = StringUtilities.firstAndLast(value);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstAndLast_withSpace(){
        //Given
        String value = "Hello, world";
        String expected = "Hd";

        //When
        String actual = StringUtilities.firstAndLast(value);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChange(){
        //Given
        String value = "world";
        String expected = "wyrld";

        //When
        String actual = StringUtilities.change(value, 'o', 'y');

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChange_atTheEnd(){
        //Given
        String value = "world";
        String expected = "worly";

        //When
        String actual = StringUtilities.change(value, 'd', 'y');

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSeparateByExaclaimation_whenThereIsNoComma(){
        //Given
        String value = "Hello world";
        String[] expected = new String[]{"Hello world"};

        //When
        String[] actual = StringUtilities.separateByExaclaimation(value);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSeparateByExaclaimation(){
        //Given
        String value = "this!is!a!string!test";
        String[] expected = new String[]{"this", "is", "a", "string", "test"};

        //When
        String[] actual = StringUtilities.separateByExaclaimation(value);
        System.out.println(Arrays.toString(actual));
        //Then
        Assert.assertArrayEquals(expected, actual);
    }




}

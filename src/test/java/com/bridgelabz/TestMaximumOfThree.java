package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class TestMaximumOfThree {

    @Test
        public void given_N_numberOfInput_maxIntegerAtFirstPosition_shouldReturnMaximum()
        {
                MaximumOfThree maximumOfThree = new MaximumOfThree();
            int checkMaxInteger = (int) maximumOfThree.findMaxOfThree(20,1,7,16,12,2);
            Assert.assertEquals(20,checkMaxInteger);
        }

    @Test
    public void given_N_numberOfInput_maxIntegerAtSecondPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        int checkMaxInteger = (int) maximumOfThree.findMaxOfThree(7,24,20,16,12,2);
        Assert.assertEquals(24,checkMaxInteger);
    }

    @Test
    public void given_N_numberOfInput_maxIntegerAtThirdPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        int checkMaxInteger = (int) maximumOfThree.findMaxOfThree(7,1,24,20,16,12,2);
        Assert.assertEquals(24,checkMaxInteger);
    }

    @Test
    public void given_N_numberOfInput_maxFloatAtFirstPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        Float checkMaxFloat = (Float) maximumOfThree.findMaxOfThree(122.25f,10.0f,25.6f,65.22f,120.0f);
        Assert.assertEquals(java.util.Optional.of(122.25f),java.util.Optional.of(checkMaxFloat));
    }

    @Test
    public void given_N_numberOfInput_maxFloatAtSecondPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        Float checkMaxFloat = (Float) maximumOfThree.findMaxOfThree(10.0f,122.5f,25.6f,65.22f,12.0f);
        Assert.assertEquals(java.util.Optional.of(122.5f),java.util.Optional.of(checkMaxFloat));
    }

    @Test
    public void given_N_numberOfInput_maxFloatAtThirdPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        Float checkMaxFloat = (Float) maximumOfThree.findMaxOfThree(10.0f,25.6f,122.5f,25.6f,65.22f,12.0f);
        Assert.assertEquals(java.util.Optional.of(122.5f),java.util.Optional.of(checkMaxFloat));
    }

    @Test
    public void givenThreeInput_maxStringAtFirstPosition_shouldReturnMaximumString()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        String checkString = (String) maximumOfThree.findMaxOfThree("Peaches","Apple","Banana");
        Assert.assertEquals("Peaches",checkString);
    }

    @Test
    public void givenThreeInput_maxStringAtSecondPosition_shouldReturnMaximumString()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        String checkString = (String) maximumOfThree.findMaxOfThree("Apple","Peaches","Banana","Orange");
        Assert.assertEquals("Peaches",checkString);
    }

    @Test
    public void givenThreeInput_maxStringAtThirdPosition_shouldReturnMaximumString()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        String checkString = (String) maximumOfThree.findMaxOfThree("Apple","Banana","Peaches","Guava");
        Assert.assertEquals("Peaches",checkString);
    }
}
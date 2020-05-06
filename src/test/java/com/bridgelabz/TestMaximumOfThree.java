package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumOfThree {

    @Test
        public void givenThreeInput_maxIntegerAtFirstPosition_shouldReturnMaximum()
        {
                MaximumOfThree maximumOfThree = new MaximumOfThree();
            int checkMaxInteger = maximumOfThree.findMaxInteger(20,10,12);
            Assert.assertEquals(20,checkMaxInteger);
        }

    @Test
    public void givenThreeInput_maxIntegerAtSecondPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        int checkMaxInteger = maximumOfThree.findMaxInteger(20,150,112);
        Assert.assertEquals(150,checkMaxInteger);
    }

    @Test
    public void givenThreeInput_maxIntegerAtThirdPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        int checkMaxInteger = maximumOfThree.findMaxInteger(20,150,255);
        Assert.assertEquals(255,checkMaxInteger);
    }

    @Test
    public void givenThreeInput_maxFloatAtFirstPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        Float checkMaxFloat = maximumOfThree.findMaxFloat(20.2f,10.0f,12.65f);
        Assert.assertEquals(java.util.Optional.of((Float)20.2f), java.util.Optional.of(checkMaxFloat));
    }

    @Test
    public void givenThreeInput_maxFloatAtSecondPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        Float checkMaxFloat = maximumOfThree.findMaxFloat(20.2f,100.0f,26.65f);
        Assert.assertEquals(java.util.Optional.of((Float)100.0f), java.util.Optional.of(checkMaxFloat));
    }

    @Test
    public void givenThreeInput_maxFloatAtThirdPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        Float checkMaxFloat = maximumOfThree.findMaxFloat(20.2f,100.0f,226.65f);
        Assert.assertEquals(java.util.Optional.of((Float)226.65f), java.util.Optional.of(checkMaxFloat));
    }

    @Test
    public void givenThreeInput_maxStringAtFirstPosition_shouldReturnMaximumString()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        String checkString = maximumOfThree.findMaxString("Apples","Peach","Guava");
        Assert.assertEquals("Apples",checkString);
    }

    @Test
    public void givenThreeInput_maxStringAtSecondPosition_shouldReturnMaximumString()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        String checkString = maximumOfThree.findMaxString("Peach","Apples","Guava");
        Assert.assertEquals("Apples",checkString);
    }
}

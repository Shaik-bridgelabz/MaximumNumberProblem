package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class TestMaximumOfThree {

    @Test
        public void givenThreeInput_maxIntegerAtFirstPosition_shouldReturnMaximum()
        {
                MaximumOfThree maximumOfThree = new MaximumOfThree();
            int checkMaxInteger = (int) maximumOfThree.findMaxOfThree(20,10,12);
            Assert.assertEquals(20,checkMaxInteger);
        }

    @Test
    public void givenThreeInput_maxIntegerAtSecondPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        int checkMaxInteger = (int) maximumOfThree.findMaxOfThree(20,150,112);
        Assert.assertEquals(150,checkMaxInteger);
    }

    @Test
    public void givenThreeInput_maxIntegerAtThirdPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        int checkMaxInteger = (int) maximumOfThree.findMaxOfThree(20,150,255);
        Assert.assertEquals(255,checkMaxInteger);
    }

    @Test
    public void givenThreeInput_maxFloatAtFirstPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        Float checkMaxFloat = (Float) maximumOfThree.findMaxOfThree(20.2f,10.0f,12.65f);
        Assert.assertEquals(Optional.of((Float)20.2f), Optional.of(checkMaxFloat));
    }

    @Test
    public void givenThreeInput_maxFloatAtSecondPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        Float checkMaxFloat = (Float) maximumOfThree.findMaxOfThree(20.2f,100.0f,26.65f);
        Assert.assertEquals(Optional.of((Float)100.0f), Optional.of(checkMaxFloat));
    }

    @Test
    public void givenThreeInput_maxFloatAtThirdPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        Float checkMaxFloat = (Float) maximumOfThree.findMaxOfThree(20.2f,100.0f,226.65f);
        Assert.assertEquals(Optional.of((Float)226.65f), Optional.of(checkMaxFloat));
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
        String checkString = (String) maximumOfThree.findMaxOfThree("Apple","Peaches","Banana");
        Assert.assertEquals("Peaches",checkString);
    }

    @Test
    public void givenThreeInput_maxStringAtThirdPosition_shouldReturnMaximumString()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree();
        String checkString = (String) maximumOfThree.findMaxOfThree("Apple","Banana","Peaches");
        Assert.assertEquals("Peaches",checkString);
    }
}

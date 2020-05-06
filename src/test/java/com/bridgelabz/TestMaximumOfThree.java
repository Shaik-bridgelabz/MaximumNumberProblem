package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class TestMaximumOfThree {

    @Test
        public void givenThreeInput_maxIntegerAtFirstPosition_shouldReturnMaximum()
        {
                MaximumOfThree maximumOfThree = new MaximumOfThree(20,10,12);
            int checkMaxInteger = (int) maximumOfThree.findMaxOfThree();
            Assert.assertEquals(maximumOfThree.firstInput,checkMaxInteger);
        }

    @Test
    public void givenThreeInput_maxIntegerAtSecondPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree(20,150,112);
        int checkMaxInteger = (int) maximumOfThree.findMaxOfThree();
        Assert.assertEquals(maximumOfThree.secondInput,checkMaxInteger);
    }

    @Test
    public void givenThreeInput_maxIntegerAtThirdPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree(20,120,220);
        int checkMaxInteger = (int) maximumOfThree.findMaxOfThree();
        Assert.assertEquals(maximumOfThree.thirdInput,checkMaxInteger);
    }

    @Test
    public void givenThreeInput_maxFloatAtFirstPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree(20.2f,10.0f,12.65f);
        Float checkMaxFloat = (Float) maximumOfThree.findMaxOfThree();
        Assert.assertEquals(maximumOfThree.firstInput,checkMaxFloat);
    }

    @Test
    public void givenThreeInput_maxFloatAtSecondPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree(20.2f,100.0f,26.65f);
        Float checkMaxFloat = (Float) maximumOfThree.findMaxOfThree();
        Assert.assertEquals(maximumOfThree.secondInput,checkMaxFloat);
    }

    @Test
    public void givenThreeInput_maxFloatAtThirdPosition_shouldReturnMaximum()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree(20.2f,100.0f,226.26f);
        Float checkMaxFloat = (Float) maximumOfThree.findMaxOfThree();
        Assert.assertEquals(maximumOfThree.thirdInput,checkMaxFloat);
    }

    @Test
    public void givenThreeInput_maxStringAtFirstPosition_shouldReturnMaximumString()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree("Peaches","Apple","Banana");
        String checkString = (String) maximumOfThree.findMaxOfThree();
        Assert.assertEquals(maximumOfThree.firstInput,checkString);
    }

    @Test
    public void givenThreeInput_maxStringAtSecondPosition_shouldReturnMaximumString()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree("Apple","Peaches","Banana");
        String checkString = (String) maximumOfThree.findMaxOfThree();
        Assert.assertEquals(maximumOfThree.secondInput,checkString);
    }

    @Test
    public void givenThreeInput_maxStringAtThirdPosition_shouldReturnMaximumString()
    {
        MaximumOfThree maximumOfThree = new MaximumOfThree("Apple","Banana","Peaches");
        String checkString = (String) maximumOfThree.findMaxOfThree();
        Assert.assertEquals(maximumOfThree.thirdInput,checkString);
    }
}

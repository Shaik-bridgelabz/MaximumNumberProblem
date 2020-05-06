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
}

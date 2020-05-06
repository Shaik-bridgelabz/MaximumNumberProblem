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
}

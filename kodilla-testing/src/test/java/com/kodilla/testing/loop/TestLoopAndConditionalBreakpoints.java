package com.kodilla.testing.loop;

import org.junit.Assert;
import org.junit.Test;

public class TestLoopAndConditionalBreakpoints {
    @Test
    public void testLoop(){
        //Given
        long sum = 0;
        //When
        for (int n = 0;n < 1000;n++){
            sum += n;
            System.out.println("[" + n + "] sum equals: " + sum);
        }
        //Then
        Assert.assertEquals(499500,sum);
    }
}

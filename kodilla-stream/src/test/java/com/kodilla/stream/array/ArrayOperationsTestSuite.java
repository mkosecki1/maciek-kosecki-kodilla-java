package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given

        int[] numbers = IntStream.range(1,11).toArray();

        //When
        double theAverage = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(5.5, theAverage,0.0);
        System.out.println(theAverage);








    }

}

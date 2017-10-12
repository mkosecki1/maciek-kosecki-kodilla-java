package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test case begin");
    }
    @After
    public void after(){
        System.out.println("Test case end");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Test suite begin");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Test suite end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> test1List = new ArrayList<>();
        //When
        test1List = null;
        //Then
        assertEquals(test1List.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
       //Given
       ArrayList<Integer> testList = new ArrayList<>();
       //When
       testList.add(0);
       testList.add(1);
       //Then
       assertEquals(testList.get(0),0);
       assertEquals(testList.get(1),1);

    }
}

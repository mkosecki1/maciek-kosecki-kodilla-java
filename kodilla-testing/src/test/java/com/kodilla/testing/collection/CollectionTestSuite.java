package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test case begin");
    }
    @After
    public void after(){
        System.out.println("Test case end");
    }
    //@BeforeClass
    //public void beforeClass(){
    //    System.out.println("Test suite begin");
    //}
    //@AfterClass
    //public void afterClass(){
    //   System.out.println("Test suite end");
    //}

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList input = new ArrayList<>();

        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> output = oddNumbersExterminator.exterminate(input);

        //Then
        Assert.assertTrue(output.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList input = new ArrayList<>();

        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> output = oddNumbersExterminator.exterminate(input);
        for (int n=0; n<10;n++){
            output.get(n);
        }

        //Then
        Assert.assertArrayEquals(output, numbers);
    }
    //@Test
    //public void testOddNumbersExterminatorNormalList(){
       //Given
       //ArrayList<Integer> testList = new ArrayList<>();
       //When
       //testList.add(0);
       //testList.add(1);
       //Then
       //assertEquals(testList.get(0),0);
       //assertEquals(testList.get(1),1);

}






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
    @BeforeClass
    public static void beforeClass(){
<<<<<<< HEAD
       System.out.println("Test suite begin");
    }
    @AfterClass
    public static void afterClass(){
       System.out.println("Test suite end");
=======
        System.out.println("Test suite begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite end");
>>>>>>> zadanie_6_4
    }

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
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);

        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> output = oddNumbersExterminator.exterminate(input);

        //Then
        for (int n = 0; n < output.size(); n++){
            int temp = output.get(n);
            Assert.assertTrue(temp % 2 == 0);
        }

    }

}






package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticMethodsTestSuite {

    @Before
    public void before(){
        System.out.println("exercise 6.5. Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("exercise 6.5. Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("exercise 6.5. Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("exercise 6.5. Test Suite: end");
    }

    @Test
    public void testCalculateAdvStatistics_1(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount = 0;
        int commentsCount = 5;
        ArrayList<String> usersList = new ArrayList<String>();
        usersList.add("User_1");
        usersList.add("User_2");
        usersList.add("User_3");
        usersList.add("User_4");

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        StatisticMethods statisticMethods = new StatisticMethods(statisticsMock);

        //When
        statisticMethods.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticMethods.getAveragePostsPerUser(),1.0);
        Assert.assertEquals(0.0, statisticMethods.getAverageCommentsPerUser(),1.0);
        Assert.assertEquals(0.0, statisticMethods.getAverageCommentsPerPost(),1.0);
    }

    @Test
    public void testCalculateAdvStatistics_2(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount = 1000;
        int commentsCount = 0;
        ArrayList<String> usersList = new ArrayList<String>();
        usersList.add("User_1");
        usersList.add("User_2");
        usersList.add("User_3");
        usersList.add("User_4");

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        StatisticMethods statisticMethods = new StatisticMethods(statisticsMock);

        //When
        statisticMethods.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(250.0, statisticMethods.getAveragePostsPerUser(),0.0);
        Assert.assertEquals(2.0, statisticMethods.getAverageCommentsPerUser(),2.0);
        Assert.assertEquals(2.0, statisticMethods.getAverageCommentsPerPost(),2.0);
    }

    @Test
    public void testCalculateAdvStatistics_3(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount = 5;
        int commentsCount = 0;
        ArrayList<String> usersList = new ArrayList<String>();
        usersList.add("User_1");
        usersList.add("User_2");
        usersList.add("User_3");
        usersList.add("User_4");

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        StatisticMethods statisticMethods = new StatisticMethods(statisticsMock);

        //When
        statisticMethods.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1.0, statisticMethods.getAveragePostsPerUser(),1.0);
        Assert.assertEquals(2.0, statisticMethods.getAverageCommentsPerUser(),2.0);
        Assert.assertEquals(2.0, statisticMethods.getAverageCommentsPerPost(),2.0);
    }

    @Test
    public void testCalculateAdvStatistics_4(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount = 15;
        int commentsCount = 5;
        ArrayList<String> usersList = new ArrayList<String>();
        usersList.add("User_1");
        usersList.add("User_2");
        usersList.add("User_3");
        usersList.add("User_4");

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        StatisticMethods statisticMethods = new StatisticMethods(statisticsMock);

        //When
        statisticMethods.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1.0, statisticMethods.getAveragePostsPerUser(),10.0);
        Assert.assertEquals(1.0, statisticMethods.getAverageCommentsPerUser(),5.0);
        Assert.assertEquals(1.0, statisticMethods.getAverageCommentsPerPost(),3.0);
    }

    @Test
    public void testCalculateAdvStatistics_5(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount = 5;
        int commentsCount = 15;
        ArrayList<String> usersList = new ArrayList<String>();
        usersList.add("User_1");
        usersList.add("User_2");
        usersList.add("User_3");
        usersList.add("User_4");

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        StatisticMethods statisticMethods = new StatisticMethods(statisticsMock);

        //When
        statisticMethods.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1.0, statisticMethods.getAveragePostsPerUser(),1.0);
        Assert.assertEquals(2.0, statisticMethods.getAverageCommentsPerUser(),2.0);
        Assert.assertEquals(2.0, statisticMethods.getAverageCommentsPerPost(),2.0);
    }

    @Test
    public void testCalculateAdvStatistics_6(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount = 5;
        int commentsCount = 5;
        ArrayList<String> usersList = new ArrayList<String>();

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        StatisticMethods statisticMethods = new StatisticMethods(statisticsMock);

        //When
        statisticMethods.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticMethods.getAveragePostsPerUser(),1.0);
        Assert.assertEquals(0.0, statisticMethods.getAverageCommentsPerUser(),2.0);
        Assert.assertEquals(0.0, statisticMethods.getAverageCommentsPerPost(),2.0);
    }

    @Test
    public void testCalculateAdvStatistics_7(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount = 20;
        int commentsCount = 30;
        ArrayList<String> usersList = new ArrayList<String>();
        for (int n=0;n<100;n++){
            usersList.add("user" + n);
        }

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        StatisticMethods statisticMethods = new StatisticMethods(statisticsMock);

        //When
        statisticMethods.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1.0, statisticMethods.getAveragePostsPerUser(),1.0);
        Assert.assertEquals(2.0, statisticMethods.getAverageCommentsPerUser(),2.0);
        Assert.assertEquals(2.0, statisticMethods.getAverageCommentsPerPost(),2.0);
    }





}

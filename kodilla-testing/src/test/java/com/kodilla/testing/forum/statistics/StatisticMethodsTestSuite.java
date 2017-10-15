package com.kodilla.testing.forum.statistics;

import com.sun.org.glassfish.external.statistics.Statistic;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticMethodsTestSuite {

    @Test
    public void testCalculateAdvStatistics_1(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount = 0;
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
        Assert.assertEquals(0.0, statisticMethods.getAveragePostsPerUser(),0.0);
        Assert.assertEquals(0.0, statisticMethods.getAverageCommentsPerUser(),0.0);
        Assert.assertEquals(0.0, statisticMethods.getAverageCommentsPerPost(),0.0);
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
        int postsCount = 0;
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

}

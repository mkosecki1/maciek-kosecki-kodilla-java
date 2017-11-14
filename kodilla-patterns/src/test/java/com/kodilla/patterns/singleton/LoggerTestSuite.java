package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void openLoggerFile(){
        Logger.getInstance().log("This is my first log");
    }

    @Test
    public void getLastLogTest(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Log text: " + lastLog);
        //Then
        Assert.assertEquals("This is my first log", lastLog);
    }
}

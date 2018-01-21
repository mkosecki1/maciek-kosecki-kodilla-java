package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTestSuite {
    @Test
    public void update(){
        //Given
        StudentQueue studentQueueOne = new StudentQueue("queue nr 1");
        StudentQueue studentQueueTwo = new StudentQueue("queue nr 2");
        StudentQueue studentQueueThree = new StudentQueue("queue nr 3");
        Mentor mentorOne = new Mentor("mentor 1");
        Mentor mentorTwo = new Mentor("mentor 2");
        studentQueueOne.registerObserver(mentorOne);
        studentQueueTwo.registerObserver(mentorOne);
        studentQueueThree.registerObserver(mentorOne);
        studentQueueTwo.registerObserver(mentorTwo);
        studentQueueThree.registerObserver(mentorTwo);

        //When
        studentQueueOne.addTask("task 1");
        studentQueueOne.addTask("task 2");
        studentQueueTwo.addTask("task 3");
        studentQueueTwo.addTask("task 4");
        studentQueueThree.addTask("task 5");
        studentQueueThree.addTask("task 6");

        //Then
        assertEquals(6,mentorOne.getUpdateCount());
        assertEquals(4,mentorTwo.getUpdateCount());
    }
}
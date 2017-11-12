package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("List has name: toDoList");
        board.getInProgressList().getTasks().add("List has name: inProgressList");
        board.getDoneList().getTasks().add("List has name: doneList");
        //Then
        Assert.assertEquals("List has name: toDoList", board.getToDoList().getTasks().get(0));
        System.out.println(board.getToDoList().getTasks().get(0));
        Assert.assertEquals("List has name: inProgressList", board.getInProgressList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("List has name: doneList", board.getDoneList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
    }
}

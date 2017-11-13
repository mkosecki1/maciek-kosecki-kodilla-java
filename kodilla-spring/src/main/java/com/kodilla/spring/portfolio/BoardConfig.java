package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("firstList")
    TaskList toDoList;

    @Autowired
    @Qualifier("secendList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("thirdList")
    TaskList doneList;

    @Bean(name = "firstList")
    @Scope("prototype")
    public TaskList takeListOne(){
        return new TaskList();
    }
    @Bean(name = "secendList")
    @Scope("prototype")
    public TaskList takeListTwo(){
        return new TaskList();
    }
    @Bean(name = "thirdList")
    @Scope("prototype")
    public TaskList takeListThree(){
        return new TaskList();
    }
    @Bean(name = "board")
    @Scope("prototype")
    public Board takeBoard(){
        return new Board(takeListOne(),takeListTwo(),takeListThree());
    }
}

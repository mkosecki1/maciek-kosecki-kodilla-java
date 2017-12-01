package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("Nazwa listy","Opis  listy");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> takeName = taskListDao.findByListName(name);

        //Then
        Assert.assertEquals(1,takeName.size());
        Assert.assertNotNull(takeName);

        //CleanUp
        int id = takeName.get(0).getId();
        taskListDao.delete(id);
    }
}

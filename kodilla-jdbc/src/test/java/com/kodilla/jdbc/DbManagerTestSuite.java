package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnection() throws SQLException{
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()){
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5,counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NO " +
                "FROM USERS U, POSTS P " +
                "WHERE U.ID = P.USER_ID " +
                "GROUP BY U.ID " +
                "HAVING COUNT(*)>=2;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        System.out.println("\ntestSelectUsersAndPosts:");
        while (resultSet.next()){
            System.out.println(resultSet.getString("FIRSTNAME") + ", " +
            resultSet.getString("LASTNAME") + ", " +
            resultSet.getString("POSTS_NO"));
            counter++;
        }
        resultSet.close();
        statement.close();
        Assert.assertEquals(1,counter);
    }
}

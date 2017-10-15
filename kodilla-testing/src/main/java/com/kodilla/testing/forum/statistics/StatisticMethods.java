package com.kodilla.testing.forum.statistics;

import com.sun.org.glassfish.external.statistics.Statistic;

import java.util.HashMap;

public class StatisticMethods {

    private Statistics statistics;
    public double numberOfUsers;
    public double numberOfPosts;
    public double numberOfComments;
    public double averagePostsPerUser;
    public double averageCommentsPerUser;
    public double averageCommentsPerPost;

    public StatisticMethods(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (statistics.usersNames().size() != 0){
            averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
            averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        } else {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        }
        if (statistics.postsCount() != 0) {
            averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        } else {
            averageCommentsPerPost = 0;
        }
    }

    public void ShowStatistics(){
        System.out.println("number of users : " + numberOfUsers);
        System.out.println("number of posts : " + numberOfPosts);
        System.out.println("number of comments : " + numberOfComments);
        System.out.println("average posts per user : " + averagePostsPerUser);
        System.out.println("average comments per user : " + averageCommentsPerUser);
        System.out.println("average comments per post : " + averageCommentsPerPost);
    }

    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}


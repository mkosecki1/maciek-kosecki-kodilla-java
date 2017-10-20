package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.*;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private final int publishedPosts;

    public ForumUser(int userId, String username, char userSex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int publishedPosts) {
        this.userId = userId;
        this.username = username;
        this.userSex = userSex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publishedPosts = publishedPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userSex=" + userSex +
                ", dateOfBirth=" + dateOfBirth +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}

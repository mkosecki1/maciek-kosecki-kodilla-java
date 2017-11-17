package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User userOne = new Millenials("Ola");
        User userTwo = new YGeneration("Maciek");
        User userThree = new ZGeneration("Kuba");

        //When
        String userOneSocialMedia = userOne.sharePost();
        System.out.println("This user used to use: " + userOneSocialMedia);
        String userTwoSocialMedia = userTwo.sharePost();
        System.out.println("This user used to use: " + userTwoSocialMedia);
        String userThreeSocialMedia = userThree.sharePost();
        System.out.println("This user used to use: " + userThreeSocialMedia);

        //Then
        Assert.assertEquals("Twitter",userOneSocialMedia);
        Assert.assertEquals("Snapchat",userTwoSocialMedia);
        Assert.assertEquals("Facebook", userThreeSocialMedia);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User userOne = new Millenials("Ola");
        //When
        String userOneSocialMedia = userOne.sharePost();
        System.out.println("\nUser used to use: " + userOneSocialMedia);
        userOne.setSharePost(new SnapchatPublisher());
        userOneSocialMedia = userOne.sharePost();
        System.out.println("User now using: " + userOneSocialMedia);
    }
}

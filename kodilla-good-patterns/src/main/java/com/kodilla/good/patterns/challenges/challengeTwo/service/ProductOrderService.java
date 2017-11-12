package com.kodilla.good.patterns.challenges.challengeTwo.service;

import com.kodilla.good.patterns.challenges.challengeTwo.attributes.Product;
import com.kodilla.good.patterns.challenges.challengeTwo.attributes.User;

import java.time.LocalDateTime;

public class ProductOrderService {
    public boolean order(User user, Product product, LocalDateTime orderDate){
       System.out.println("User: " + user.getUsername() + " has orderd " + product.getProductName() + " on date: " + orderDate);
       return true;
    }
}

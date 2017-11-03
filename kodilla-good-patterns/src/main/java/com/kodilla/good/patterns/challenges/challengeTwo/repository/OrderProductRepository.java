package com.kodilla.good.patterns.challenges.challengeTwo.repository;

import com.kodilla.good.patterns.challenges.challengeTwo.attributes.Product;
import com.kodilla.good.patterns.challenges.challengeTwo.attributes.User;

import java.time.LocalDateTime;

public class OrderProductRepository implements OrderRepository{
    @Override
    public void takeOrder(User user, Product product, LocalDateTime orderDate) {
    }
}

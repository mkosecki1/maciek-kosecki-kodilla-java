package com.kodilla.good.patterns.challenges.challengeTwo.repository;

import com.kodilla.good.patterns.challenges.challengeTwo.attributes.Product;
import com.kodilla.good.patterns.challenges.challengeTwo.attributes.User;

import java.time.LocalDateTime;

public interface OrderRepository {
    void takeOrder(User user, Product product, LocalDateTime orderDate);
}

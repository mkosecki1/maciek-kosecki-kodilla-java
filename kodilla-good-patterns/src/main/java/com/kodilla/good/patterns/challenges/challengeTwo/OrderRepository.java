package com.kodilla.good.patterns.challenges.challengeTwo;

import java.time.LocalDateTime;

public interface OrderRepository {
    void takeOrder(User user, Product product, LocalDateTime orderDate);
}

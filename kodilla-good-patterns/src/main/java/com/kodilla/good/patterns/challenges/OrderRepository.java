package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    void takeOrder(User user, Product product, LocalDateTime orderDate);
}

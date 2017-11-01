package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderRepository {
    void takeOrder(User user, Product product, LocalDate orderDate);
}

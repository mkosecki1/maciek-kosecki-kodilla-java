package com.kodilla.good.patterns.challenges.challengeTwo;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("nowak77", "Nowak");
        Product product = new Product("Fifa 18");
        LocalDateTime orderDate = LocalDateTime.of(2017, 11, 2, 10,15);
        return new OrderRequest(user, product, orderDate);
    }
}
